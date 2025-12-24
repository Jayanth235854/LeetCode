class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        help(ans,"",0,0,n);
        return ans;
    }
    public void help(List<String> ans, String s, int open, int close, int n){
        if(open==n && close==n){
            ans.add(s);
            return;
        }
        if(open<n){
            help(ans,s+"(", open+1,close,n);
        }
        if(close<open){
            help(ans,s+")",open,close+1,n);
        }
    }
}