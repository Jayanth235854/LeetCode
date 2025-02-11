class Solution {
    public String removeOccurrences(String s, String part) {
        int n=part.length();
        while(s.contains(part)){
            int i=s.indexOf(part);
            s=s.substring(0,i)+s.substring(i+n);
        }
        return s;
    }
}