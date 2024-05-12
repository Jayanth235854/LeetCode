class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int max=0,c=0;
            while(nums[i]>0){
                int n=nums[i]%10;
                if(n>max)max=n;
                nums[i]/=10;
                c++;
            }
            int k=0,digit=0;
            while(k<c){
                digit=digit*10+max;
                k++;
            }
            sum+=digit;
        }
        return sum;
    }
}