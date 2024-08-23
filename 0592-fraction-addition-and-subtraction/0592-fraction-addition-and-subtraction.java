import java.util.regex.*;
import java.math.BigInteger;
class Solution {
    public String fractionAddition(String expression) {
        String[] terms = expression.split("(?=[+-])");
        
        // Initialize numerator and denominator
        BigInteger numerator = BigInteger.ZERO;
        BigInteger denominator = BigInteger.ONE;
        
        for (String term : terms) {
            // Parse the fraction term
            BigInteger[] fraction = parseFraction(term);
            BigInteger termNumerator = fraction[0];
            BigInteger termDenominator = fraction[1];
            
            // Update the total numerator and denominator
            denominator = denominator.multiply(termDenominator);
            numerator = numerator.multiply(termDenominator).add(termNumerator.multiply(denominator.divide(termDenominator)));
        }
        
        // Simplify the result
        BigInteger gcd = numerator.gcd(denominator);
        numerator = numerator.divide(gcd);
        denominator = denominator.divide(gcd);
        
        // Handle case where denominator is negative
        if (denominator.compareTo(BigInteger.ZERO) < 0) {
            numerator = numerator.negate();
            denominator = denominator.negate();
        }
        
        // Handle zero numerator
        if (numerator.equals(BigInteger.ZERO)) {
            denominator = BigInteger.ONE;
        }
        
        // Return result as string
        return numerator.toString() + "/" + denominator.toString();
    }
    private static BigInteger[] parseFraction(String term) {
        term = term.replaceAll(" ", ""); // Remove any spaces
        Pattern pattern = Pattern.compile("([+-]?)(\\d+)/(\\d+)");
        Matcher matcher = pattern.matcher(term);
        
        if (matcher.matches()) {
            String sign = matcher.group(1);
            BigInteger numerator = new BigInteger(matcher.group(2));
            BigInteger denominator = new BigInteger(matcher.group(3));
            
            if ("-".equals(sign)) {
                numerator = numerator.negate();
            }
            
            return new BigInteger[] { numerator, denominator };
        }
        
        throw new IllegalArgumentException("Invalid fraction format");
    }
}