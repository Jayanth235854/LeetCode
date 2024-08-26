class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] sf=new int[26], tf=new int[26];
        for(int i=0;i<s.length();i++)sf[s.charAt(i)-'a']++;
        for(int i=0;i<target.length();i++)tf[target.charAt(i)-'a']++;
        int min=10000;
        for(int i=0;i<target.length();i++){
            if(sf[target.charAt(i)-'a']>0){
                int m=sf[target.charAt(i)-'a']/tf[target.charAt(i)-'a'];
                min=Math.min(min,m);
            }else return 0;
        }
        return min;
    }
}