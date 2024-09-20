class Solution {
    public String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String temp = s + "#" + rev;
        
        int[] lps = computeLPS(temp);
        
        // Characters to add to the start of the original string
        String addOn = rev.substring(0, rev.length() - lps[lps.length - 1]);
        
        return addOn + s;
    }
    
    // Compute the Longest Prefix Suffix array for KMP pattern matching
    private int[] computeLPS(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;
        
        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
