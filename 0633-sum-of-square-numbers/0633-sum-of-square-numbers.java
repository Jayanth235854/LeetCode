class Solution {
    public boolean judgeSquareSum(int c) {
        long right =(int)Math.sqrt(c), left=0;
        while(left<=right){
            long sum=left*left + right*right;
            if(sum==c)return true;
            if(sum<c)left++;
            else right--;
        }
        return false;
    }
}