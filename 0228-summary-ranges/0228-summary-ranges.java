class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length, st=0;
        List<String> arr=new ArrayList<>();
        if(n==0)return arr;
        else st=nums[0];
        for(int i=0;i<n-1;i++){
            if(nums[i]!=(nums[i+1]-1)){
                if(st==nums[i])arr.add(Integer.toString(nums[i]));
                else{
                    String a=Integer.toString(st);
                    a+="->";
                    a+=Integer.toString(nums[i]);
                    arr.add(a);
                }
                st=nums[i+1];
            }
        }
        if(st==nums[n-1])arr.add(Integer.toString(nums[n-1]));
        else {
            String a=Integer.toString(st);
            a+="->";
            a+=Integer.toString(nums[n-1]);
            arr.add(a);
        }
        return arr;
    }
}