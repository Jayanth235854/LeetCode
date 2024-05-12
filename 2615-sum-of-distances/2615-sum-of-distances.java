class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long prefix[] = new long[n];
        long posfix[] = new long[n];
        int count[] = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(nums[i])){
                int prev = map.get(nums[i]);
                prefix[i] = prefix[prev] + count[prev] *(i-prev);
                count[i] = count[prev];
            }    
            count[i] += 1;
            map.put(nums[i], i);   
        }
        map.clear();
        count = new int[n];
        for(int i=n-1; i>=0; i--){
            if(map.containsKey(nums[i])){
                int prev = map.get(nums[i]);
                posfix[i] = posfix[prev] + count[prev] *(prev - i);
                count[i] = count[prev];
            } 
            count[i] += 1;
            map.put(nums[i], i);
            prefix[i] += posfix[i];
        }
        return prefix;
    }
}