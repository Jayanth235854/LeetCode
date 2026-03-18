class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr=new int[k];
        Map<Integer,Integer> hm=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            max=Math.max(hm.get(nums[i]),max);
        }
        while(k>0){
            for(Map.Entry<Integer,Integer> m:hm.entrySet()){
                if(k==0)break;
                if(m.getValue()==max){
                    arr[k-1]=m.getKey();
                    k--;
                }
            }
            max--;
        }
        return arr;
    }
}