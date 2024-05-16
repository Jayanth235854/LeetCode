import java.math.BigInteger;
class Solution {
    public int numDifferentIntegers(String word) {
        char[] a = word.toCharArray();
        List<BigInteger> ans = new ArrayList<>();
        BigInteger n = BigInteger.ZERO;
        int c = 0;

        for (int i = 0; i < a.length; i++) {
            if (Character.isDigit(a[i])) {
                BigInteger digit = BigInteger.valueOf(a[i] - '0');
                n = n.multiply(BigInteger.TEN).add(digit);
                c++;
            } else if (c > 0 && n.compareTo(BigInteger.ZERO) >= 0) {
                ans.add(n);
                n = BigInteger.ZERO;
                c = 0;
            }
            if (i == a.length - 1 && c > 0) {
                ans.add(n);
            }
        }

        BigInteger[] ax = new BigInteger[ans.size()];
        ans.toArray(ax);
        int count = ans.size();
        Arrays.sort(ax);

        for (int i = 0; i < ans.size() - 1; i++) {
            if (ax[i].equals(ax[i + 1])) {
                count--;
            }
        }
        return count;
    }
}