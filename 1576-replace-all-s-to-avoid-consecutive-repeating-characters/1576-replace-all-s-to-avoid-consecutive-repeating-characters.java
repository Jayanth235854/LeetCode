class Solution {
    public String modifyString(String s) {
        char[] arr = s.toCharArray();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (arr[i] == '?') {
                char prevChar = (i > 0) ? arr[i - 1] : ' ';
                char nextChar = (i < n - 1) ? arr[i + 1] : ' ';
                for (char c = 'a'; c <= 'z'; c++) {
                    if (c != prevChar && c != nextChar) {
                        arr[i] = c;
                        break;
                    }
                }
            }
        }
        return new String(arr);
    }
}