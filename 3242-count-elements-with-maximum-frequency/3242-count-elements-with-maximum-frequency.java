class Solution {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=1;
            if(nums[i]==-1)continue;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    nums[j]=-1;
                    count++;
                }
            }
            arr[i]=count;
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(arr[i]>max)max=arr[i];
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(max==arr[i])count++;
        }
        return max*count;
    }
}