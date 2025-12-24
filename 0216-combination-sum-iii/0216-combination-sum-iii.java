class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        help(1,k,n,ans,new ArrayList<>());
        return ans;
    }
    public void help(int i,int k,int n,List<List<Integer>> ans, List<Integer> ls){
        if(k==0){
            if(n==0) ans.add(new ArrayList<>(ls));
            return;
        }
        for(;i<=9;i++){
            ls.add(i);
            help(i+1,k-1,n-i,ans,ls);
            ls.remove(ls.size()-1);
        }
    }
}