class Solution {
    public char findTheDifference(String s, String t) {
        int result = 0;
        for(char c : t.toCharArray()){
            result += c;
        }
        for(char _c : s.toCharArray()){
            result -= _c;
        }
        return (char) result;
    }
}