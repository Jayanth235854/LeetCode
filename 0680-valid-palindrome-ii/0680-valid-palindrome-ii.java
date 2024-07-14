class Solution {
    public boolean validPalindrome(String s) {
        int n=s.length(),a=1;
        if(n<3)return true;
        for(int i=0,j=n-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return rev(i+1,j,s) || rev(i,j-1,s);
            }
        }
        return true;
    }
    public boolean rev(int i,int j,String s){
        for(;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j))return false;
        }
        return true;
    }
}