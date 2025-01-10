class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int n = words1.length, m = words2.length;
        List<String> result = new ArrayList<>();
        int[] freq = new int[26];
        for (String word : words2) {
            int[] tempFreq = new int[26];
            for (char c : word.toCharArray()) {
                tempFreq[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                freq[i] = Math.max(freq[i], tempFreq[i]);
            }
        }
        for (String word : words1) {
            int[] wordFreq = new int[26];
            for (char c : word.toCharArray()) {
                wordFreq[c - 'a']++;
            }
            boolean isUniversal = true;
            for (int i = 0; i < 26; i++) {
                if (wordFreq[i] < freq[i]) {
                    isUniversal = false;
                    break;
                }
            }
            if (isUniversal) {
                result.add(word);
            }
        }
        return result;
    }
}
