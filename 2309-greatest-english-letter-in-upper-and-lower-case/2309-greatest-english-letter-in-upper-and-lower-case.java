class Solution {
    public String greatestLetter(String s) {
        int[] caps=new int[26], sm=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)>95)caps[s.charAt(i)-'a']++;
            else sm[s.charAt(i)-'A']++;
        }
        char a='A';
        for(int i=25;i>=0;i--){
            if(caps[i]>0 && sm[i]>0){
                a+=i;
                return Character.toString(a);
            }
        }
        return "";
    }
}