class Solution {
    public int minBitFlips(int start, int goal) {
        int a=start^goal,ans=0;
        while(a>0){
            if((a&1)==1)ans++;
            a=a>>1;
        }
        return ans;
    }
}