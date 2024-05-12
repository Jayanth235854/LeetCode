class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length,sum=0;
        ArrayList<Integer> maxi=new ArrayList<Integer>();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int r=nums[i],max=0;
            if(nums[i]==-1)continue;
            while(r>0){
                int d=r%10;
                if(max<d)max=d;
                r=r/10;
            }
            arr[i]=max;
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j])sum=nums[i]+nums[j];
                maxi.add(sum);
            }
        }
        int s=maxi.size();
        int max=0;
        for(int i=0;i<s;i++){
            if(max<maxi.get(i))max=maxi.get(i);
        }
        if(max==0) return -1;
        return max;
    }
}