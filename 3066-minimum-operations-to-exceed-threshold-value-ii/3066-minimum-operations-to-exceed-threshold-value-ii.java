class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)pq.add((long)nums[i]);
        int count=0;
        while(pq.size()>1){
            long x=pq.poll();
            if(x>=k)break;
            long y=pq.poll();
            long val=2*x+y;
            pq.add(val);
            count++;
        }
        return count;
    }
}