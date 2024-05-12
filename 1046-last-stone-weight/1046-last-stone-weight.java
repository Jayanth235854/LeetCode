class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        while(n>1){
            Arrays.sort(stones);
            int x=stones[n-1];
            int y=stones[n-2];
            n-=2;
            if(x!=y){
                stones[n++]=x-y;
            }
        }
        return n==1?stones[0]:0;
    }
}