class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] arr = new int[26];
        int n = licensePlate.length();
        char[] licensePlates = licensePlate.toCharArray();

        for (int i = 0; i < n; i++) {
            char c = licensePlates[i];
            if (c >= 'a' && c <= 'z') arr[c - 'a']++;
            else if (c >= 'A' && c <= 'Z') arr[c - 'A']++;
        }
        int l = words.length, index = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < l; i++) {
            String word = words[i];
            int[] freq = new int[26];
            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }
            int c = 0;
            for (int j = 0; j < 26; j++) {
                if (arr[j] > 0 && arr[j] > freq[j]) {
                    c++;
                    break;
                }
            }
            if (c == 0 && word.length() < min) {
                min = word.length();
                index = i;
            }
        }
        if (index != -1) return words[index];
        return "";
    }
}
