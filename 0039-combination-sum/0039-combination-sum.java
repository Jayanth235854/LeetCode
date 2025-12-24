class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        help(0,candidates,target,ans,cur);
        return ans;
    }
    public void help(int start,int[] ls,int target, List<List<Integer>> ans, List<Integer> cur){
        if(target==0){
            ans.add(new ArrayList<>(cur));
            return;
        }
        if(target<0) return;
        for(int i=start;i<ls.length;i++){
            cur.add(ls[i]);
            help(i,ls,target-ls[i],ans,cur);
            cur.remove(cur.size()-1);
        }
    }
}