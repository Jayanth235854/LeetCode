class Solution {
    public int diagonalPrime(int[][] nums) {
        int primes=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(i==j){
                if(prime(nums[i][j])){
                    primes=Math.max(primes,nums[i][j]);
                }
            }
            j++;
        }
        j=0;
        for(int i=nums.length-1;i>=0;i--){
            if(i==j){
                j++;
                continue;
            }
            if(prime(nums[i][j])){
                primes=Math.max(primes,nums[i][j]);
            }
            j++;
        }
        return primes;
    }
    boolean prime(int n){
        if(n==1)return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }
}