class Solution {
    public boolean checkPowersOfThree(int n) {
        int[] arr=new int[]{1,3,9,27,81,243,729,2187,6561,19683,59049,177147,531441,1594323,4782969,14348907};
        int i=0,j=15,val=arr[15];
        while(i<=j){
            if(arr[j]>n)j--;
            else if(arr[j]<=n){
                n-=arr[j];
                j--;
            }
            if(n==0)return true;
        }
        return false;
    }
}