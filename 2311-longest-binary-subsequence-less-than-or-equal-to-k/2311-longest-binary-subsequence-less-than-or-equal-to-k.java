class Solution {
    public int longestSubsequence(String s, int k) {
        int n=s.length();
        int zeros=0, one=0,pow=1,val=0;
        for(char ch:s.toCharArray()){
            if(ch=='0') zeros++;
        }
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                if(pow+val>k) continue;
                one++;
                val+=pow;
            }
            pow<<=1;
            if(pow>k) break;
        }
        return zeros+one;
    }
}