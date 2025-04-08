class Solution {
    public int maximumProduct(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n==1){
            long temp=nums[0]+k;
            return (int)temp%1000000007;
        }
        PriorityQueue<Long> pq=new PriorityQueue<>();
        long ans=1;
        for(int i=0;i<n;i++)pq.add((long)nums[i]);
        while(k>0){
            long p1=pq.poll();
            long p2=pq.poll();
            long diff=Math.min(k,p2-p1+1);
            k-=diff;
            p1+=diff;
            pq.add(p1);
            pq.add(p2);
        }
        while(!pq.isEmpty()){
            ans=(ans*pq.poll())%1000000007;
        }
        return (int)ans;
    }
}