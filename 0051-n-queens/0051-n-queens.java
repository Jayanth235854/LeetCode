class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList();
        List<String> cur=new ArrayList();
        for(int i=0;i<n;i++)cur.add(".".repeat(n));
        solve(0,cur,res,n);
        return res;
    }
    public void solve(int row, List<String> cur, List<List<String>> res,int n){
        if(row==n){
            res.add(new ArrayList(cur));
            return;
        }
        for(int col=0;col<n;col++){
            if(check(row,col,cur)){
                StringBuilder sb=new StringBuilder(cur.get(row));
                sb.setCharAt(col,'Q');
                cur.set(row,sb.toString());
                solve(row+1,cur,res,n);
                sb.setCharAt(col,'.');
                cur.set(row,sb.toString());
            }
        }
    }
    public Boolean check(int row, int col, List<String> cur){
        for(int i=row-1;i>=0;i--){
            if(cur.get(i).charAt(col)=='Q')return false;
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(cur.get(i).charAt(j)=='Q')return false;
        }
        for(int i=row-1,j=col+1;i>=0 && j<cur.size();i--,j++){
            if(cur.get(i).charAt(j)=='Q')return false;
        }
        return true;
    }
}