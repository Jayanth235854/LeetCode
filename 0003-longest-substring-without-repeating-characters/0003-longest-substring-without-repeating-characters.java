class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) return 0;

        int maxLen = 0;
        int[] charIndex = new int[128];

        for (int i = 0, j = 0; j < n; j++) {
            i = Math.max(charIndex[s.charAt(j)], i);
            maxLen = Math.max(maxLen, j - i + 1);
            charIndex[s.charAt(j)] = j + 1;
        }

        return maxLen;
    }
}