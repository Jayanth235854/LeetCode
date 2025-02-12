class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer,List<Integer>> hm=new HashMap();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int temp=nums[i],sum=0;
            while(temp!=0){
                sum+=temp%10;
                temp/=10;
            }
            if(hm.containsKey(sum)){
                List<Integer> a=hm.get(sum);
                a.add(nums[i]);
            }else hm.put(sum,new ArrayList<>(Arrays.asList(nums[i])));
        }
        int max=0;
        for(Map.Entry<Integer,List<Integer>> map:hm.entrySet()){
            int sum=0;
            List<Integer> arr=map.getValue();
            if(arr.size()>1){
                if(arr.size()==2){
                    sum+=arr.get(0)+arr.get(1);
                }
                else{
                    Collections.sort(arr);
                    int size=arr.size();
                    sum+=arr.get(size-1)+arr.get(size-2);
                }
            }
            max=Math.max(max,sum);
        }
        if(max==0)return -1;
        return max;
    }
}