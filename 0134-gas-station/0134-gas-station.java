class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length,count=0;
        if(n==1 && gas[0]==cost[0])return 0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=gas[i]-cost[i];
            count+=arr[i];
        }
        if(count<0)return -1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                int sum=0,c=0;
                for(int j=i;j<i+n;j++){
                    sum+=arr[j%n];
                    c++;
                    if(sum<0)break;
                }
                if(c==n)return i;
            }
        }
        return -1;
    }
}