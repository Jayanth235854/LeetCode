class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr=s.split(" ");
        String ans="";
        for(int i=0;i<k-1;i++){
            ans=ans+arr[i]+" ";
        }
        ans=ans+arr[k-1];
        return ans;
    }
}