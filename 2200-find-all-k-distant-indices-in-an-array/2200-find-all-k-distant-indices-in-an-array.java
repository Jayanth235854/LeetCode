class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> a=new ArrayList<Integer>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(Math.abs(i-j)<=k && nums[j]==key)a.add(i);
            }
        }
        Collections.sort(a);
        Set<Integer> an=new LinkedHashSet<Integer>(a);
        List<Integer> ans=new ArrayList<Integer>(an);
        return ans;
    }
}