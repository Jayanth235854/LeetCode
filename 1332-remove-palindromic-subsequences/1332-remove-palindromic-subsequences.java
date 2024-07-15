class Solution {
    public int removePalindromeSub(String s) {
        int c=0,n=s.length()-1;
        if(n==0)return 0;
        while(c<n){
            if(s.charAt(c)!=s.charAt(n))return 2;
            c++;
            n--;
        }
        return 1;
    }
}