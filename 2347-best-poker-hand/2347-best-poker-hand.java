class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int flush=0,three=0,pair=0,high=0;
        int c=1,rmax=0,rc=1;
        Arrays.sort(ranks);
        for(int i=1;i<5;i++){
            if(suits[0]==suits[i])c++;
            if(ranks[i]==ranks[i-1]){
                rc++;
                if(rc>rmax)rmax=rc;
            }else rc=1;
        }
        if(c==5)return "Flush";
        if(rmax>=3)return "Three of a Kind";
        if(rmax==2)return "Pair";
        return "High Card";
        
    }
}