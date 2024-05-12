class Solution {
    public int maxScore(String s) {
        int max = 0;
        char[] arr = s.toCharArray();
        int zeros = 0;
        int ones = 0;
        for (char c : arr) {
            if (c == '1') {
                ones++;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == '0') {
                zeros++;
            } else {
                ones--;
            }
            max = Math.max(max, zeros + ones);
        }
        return max;
    }
}