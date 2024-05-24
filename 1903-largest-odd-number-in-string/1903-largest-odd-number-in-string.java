class Solution {
    public String largestOddNumber(String num) {
        int n=num.length(),l=-1;
        char[] ar=num.toCharArray();
        for(int i=n-1;i>=0;i--){
            if(ar[i]%2!=0){
                l=i;
                break;
            }
        }
        if(l==-1)return "";
        String ans="";
        for(int i=0;i<=l;i++){
            ans+=ar[i];
        }
        return ans;
    }
}