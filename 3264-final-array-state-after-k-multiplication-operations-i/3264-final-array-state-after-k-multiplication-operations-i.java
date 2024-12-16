class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        List<Integer> arr=new ArrayList();
        int n=nums.length;
        for(int i=0;i<n;i++)arr.add(nums[i]);
        for(int i=0;i<k;i++){
            int min=Collections.min(arr);
            int ind=arr.indexOf(min);
            arr.set(ind,multiplier*min);
        }
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=arr.get(i);
        return a;
    }
}