class Solution {
    public long pickGifts(int[] gifts, int k) {
        long ans=0;
        int n=gifts.length;
        for(int i=0;i<k;i++){
            int max=Arrays.stream(gifts).max().getAsInt();
            for(int j=0;j<n;j++){
                if(gifts[j]==max){
                    gifts[j]=(int)(Math.sqrt(max));
                    break;
                }
            }
        }
        for(int i=0;i<n;i++)ans+=gifts[i];
        return ans;
    }
}