class Solution {
    public int[] closestPrimes(int left, int right) {
        List<Integer> arr=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i==1)continue;
            int sq=(int)Math.sqrt(i),flag=0;
            for(int j=2;j<=sq;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0)arr.add(i);
        }
        if(arr.size()<=1)return new int[]{-1,-1};
        int[] ans=new int[2];
        int min=arr.get(1)-arr.get(0);
        ans[0]=arr.get(0); ans[1]=arr.get(1);
        for(int i=2;i<arr.size();i++){
            if(arr.get(i)-arr.get(i-1)<min){
                min=arr.get(i)-arr.get(i-1);
                ans[0]=arr.get(i-1);
                ans[1]=arr.get(i);
            }
        }
        return ans;
    }
}