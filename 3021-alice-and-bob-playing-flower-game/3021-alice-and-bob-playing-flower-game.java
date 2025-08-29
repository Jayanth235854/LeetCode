class Solution {
    public long flowerGame(int n, int m) {
        long odd_n=(n+1)/2;
        long even_m=m/2;
        long odd_m=(m+1)/2;
        long even_n=n/2;
        long count=(odd_n * even_m) + (even_n * odd_m);
        return count;
    }
}