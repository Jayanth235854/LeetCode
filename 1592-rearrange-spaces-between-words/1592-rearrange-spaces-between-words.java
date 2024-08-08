class Solution {
    public String reorderSpaces(String text) {
        int totalSpaces = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') totalSpaces++;
        }
        
        if (totalSpaces == 0) return text;
        
        text = text.trim();
        String[] words = text.split("\\s+");
        int numberOfWords = words.length;
        
        if (numberOfWords == 1) {
            return words[0] + " ".repeat(totalSpaces);
        }
        
        int spacesBetweenWords = totalSpaces / (numberOfWords - 1);
        int extraSpaces = totalSpaces % (numberOfWords - 1);
        
        String spaces = " ".repeat(spacesBetweenWords);
        String result = String.join(spaces, words);
        
        result += " ".repeat(extraSpaces);
        
        return result;
    }
}
