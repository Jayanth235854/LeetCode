class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> dict = new HashSet<>();
        for (String word : dictionary) dict.add(word);
        int n = s.length();
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) dp[i] = i;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                String substring = s.substring(j, i);
                if (dict.contains(substring)) {
                    // If the substring is in the dictionary, we don't need extra characters
                    dp[i] = Math.min(dp[i], dp[j]);
                }
            }
            // Consider the case where we treat the character at position i-1 as extra
            dp[i] = Math.min(dp[i], dp[i - 1] + 1);
        }
        return dp[n];
    }
}