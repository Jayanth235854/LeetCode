class Solution {
    public int minimumOperations(int[] nums) {
        int count=0, n=nums.length;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        if(!hm.values().stream().anyMatch(value -> value > 1)) return 0;
        if(n<=3)return 1;
        for(int i=0;i<n;i+=3){
            if(!hm.values().stream().anyMatch(value -> value > 1))break;
            if(n-i<=3 && hm.values().stream().anyMatch(value -> value > 1)){
                count++; break;
            }else if(n-i<=3 && hm.values().stream().anyMatch(value -> value <=1)) break;
            if(hm.get(nums[i])==1)hm.remove(nums[i]);
            if(hm.get(nums[i+1])==1)hm.remove(nums[i+1]);
            if(hm.get(nums[i+2])==1)hm.remove(nums[i+2]);
            if(hm.containsKey(nums[i]) && hm.get(nums[i])>1)hm.put(nums[i],hm.get(nums[i])-1);
            if(hm.containsKey(nums[i+1]) && hm.get(nums[i+1])>1)hm.put(nums[i+1],hm.get(nums[i+1])-1);
            if(hm.containsKey(nums[i+2]) && hm.get(nums[i+2])>1)hm.put(nums[i+2],hm.get(nums[i+2])-1);
            count++;
        }
        return count;
    }
}