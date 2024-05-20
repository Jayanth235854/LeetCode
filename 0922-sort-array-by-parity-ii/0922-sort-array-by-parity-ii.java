class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                if(nums[i]%2==0)continue;
                else{
                    for(int j=i+1;j<n;j++){
                        if(nums[j]%2==0){
                            int a=nums[i];
                            nums[i]=nums[j];
                            nums[j]=a;
                            break;
                        }
                    }
                }
            }else{
                if(nums[i]%2!=0)continue;
                else{
                    for(int j=i+1;j<n;j++){
                        if(nums[j]%2!=0){
                            int a=nums[i];
                            nums[i]=nums[j];
                            nums[j]=a;
                            break;
                        }
                    }
                }
            }
        }
        return nums;
    }
}