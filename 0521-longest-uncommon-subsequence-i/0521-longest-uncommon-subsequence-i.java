class Solution {
    public int findLUSlength(String a, String b) {
        if(a.length()!=b.length()){
            if(a.length()>b.length())return a.length();
            return b.length();
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i))return a.length();
        }
        return -1;
    }
}