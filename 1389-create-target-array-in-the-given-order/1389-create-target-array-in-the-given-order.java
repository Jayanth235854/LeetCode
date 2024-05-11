class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int j=nums[i];
            arr.add(index[i],j);
        }
        int[] target = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            target[i] = arr.get(i);
        }
        return target;
    }
}