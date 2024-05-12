class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n=cost.length,sum=0;
        if(n==1)return cost[0];
        if(n==2)return (cost[0]+cost[1]);
        if(n%3==0){
            for(int i=n-1;i>=0;i=i-3){
                sum=sum+cost[i]+cost[i-1];
            }
        }
        else{
            for(int i=n-1;i>=0;i=i-3){
                if(i==0)return (sum+cost[0]);
                sum=sum+cost[i]+cost[i-1];
            }
        }
        return sum;
    }
}