class Solution {
    public boolean isSubstringPresent(String s) {
        Set<String> substrings = new HashSet<>();
        Set<String> reversedSubstrings = new HashSet<>();
        for (int i = 0; i < s.length() - 1; i++) {
            String substring = s.substring(i, i + 2);
            substrings.add(substring);
        }
        
        for (String substring : substrings) {
            reversedSubstrings.add(new StringBuilder(substring).reverse().toString());
        }
        
        for (int i = 0; i < s.length() - 1; i++) {
            String substring = s.substring(i, i + 2);
            if (reversedSubstrings.contains(substring)) {
                return true;
            }
        }
        return false;
    }
}