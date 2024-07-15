class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int[] perm=new int[n+1];
        int d=n,i=0;
        for(int a=0;a<n;a++){
            if(s.charAt(a)=='I'){
                perm[a]=i;
                i++;
            }else{
                perm[a]=d;
                d--;
            }
        }
        perm[n]=i;
        return perm;
    }
}