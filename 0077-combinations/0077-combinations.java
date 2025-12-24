class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        help(ans,cur,n,k,1);
        return ans;
    }
    public void help(List<List<Integer>> ans,List<Integer> cur,int n,int k,int i){
        if(cur.size()==k){
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(;i<=n;i++){
            if(!cur.contains(i)){
                cur.add(i);
                help(ans,cur,n,k,i+1);
                cur.remove(cur.size()-1);
            }
        }
    }
}