class Solution {
    int dest;
    int[][] adj;
    List<List<Integer>> ans=new ArrayList();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n=graph.length;
        dest=n-1;
        adj=graph;
        List<Integer> arr=new ArrayList();
        help(0,arr);
        return ans;
    }
    public void help(int curr,List<Integer> arr){
        arr.add(curr);
        if(curr==dest){
            ans.add(new ArrayList<>(arr));
            arr.remove(arr.size()-1);
            return;
        }
        for(int neigh:adj[curr]){
            help(neigh,arr);
        }
        arr.remove(arr.size()-1);
    }
}