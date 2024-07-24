class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] answer = new int[n];
        int dist = 10000;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) dist = 0;
            else dist++;
            answer[i] = dist;
        }
        dist = 10000;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) dist = 0; 
            else dist++;
            answer[i] = Math.min(answer[i], dist);
        }
        return answer;
    }
}