class Solution {
    public int maxProduct(int[] nums) {
        int curProd  = 1;
        int maxProd =  nums[0];
        for(int i =0; i<nums.length; i++){
            curProd *= nums[i];
            if(curProd > maxProd) maxProd = curProd;
            if(curProd == 0) curProd =1;
        }
        curProd =1;
        for(int i = nums.length -1; i >= 0; i--){
            curProd *= nums[i];
            if(curProd > maxProd) maxProd = curProd;
            if(curProd == 0) curProd = 1;
        }
        return maxProd;
    }
}