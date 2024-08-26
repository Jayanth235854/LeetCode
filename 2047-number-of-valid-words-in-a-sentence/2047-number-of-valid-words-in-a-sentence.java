class Solution {
    public int countValidWords(String sentence) {
        String[] arr = sentence.strip().split("\\s+");
        int count = 0;
        for (String word : arr) {
            if (isValidWord(word)) count++;
        }
        return count;
    }
    private boolean isValidWord(String word) {
        int hyphenCount = 0;
        boolean hasPunctuation = false;
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isDigit(ch)) return false;
            if (ch == '!' || ch == '.' || ch == ',') {
                if (i != word.length() - 1) return false;
                hasPunctuation = true;
            }
            if (ch == '-') {
                hyphenCount++;
                if (i == 0 || i == word.length() - 1 || hyphenCount > 1 ||
                    !Character.isLowerCase(word.charAt(i - 1)) ||
                    !Character.isLowerCase(word.charAt(i + 1))) {
                    return false;
                }
            }
        }
        return hyphenCount <= 1 && (!hasPunctuation || word.length() > 0 && ",.!".indexOf(word.charAt(word.length() - 1)) != -1);
    }
}