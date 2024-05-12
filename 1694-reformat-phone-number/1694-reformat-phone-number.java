class Solution {
    public String reformatNumber(String number) {
        String cleanedNumber = number.replaceAll("[\\s-]", "");
        StringBuilder formatted = new StringBuilder();
        int n = cleanedNumber.length();
        int i = 0;
        while (i < n) {
            if (n - i > 4) {
                formatted.append(cleanedNumber.substring(i, i + 3)).append("-");
                i += 3;
            } else if (n - i == 4) {
                formatted.append(cleanedNumber.substring(i, i + 2)).append("-");
                i += 2;
                formatted.append(cleanedNumber.substring(i, i + 2));
                i += 2;
            } else {
                formatted.append(cleanedNumber.substring(i));
                i = n;
            }
        }
        return formatted.toString();
    }
}