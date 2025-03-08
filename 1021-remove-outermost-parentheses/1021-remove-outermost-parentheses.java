class Solution {
    public String removeOuterParentheses(String s) {
        int open=0, n=s.length(),start=0;
        String ans="";
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(')open++;
            else open--;
            if(open==0){
                String temp=s.substring(start+1,i);
                start=i+1;
                ans+=temp;
            }
        }
        return ans;
    }
}