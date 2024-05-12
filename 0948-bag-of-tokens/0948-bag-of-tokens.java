class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int l=0,n=tokens.length-1,score=0,max=0;
        while(l<=n){
            if(power>=tokens[l]){
                power-=tokens[l++];
                score++;
                max=Math.max(score,max);
            }else if(score>0){
                power+=tokens[n--];
                score--;
            }else break;
        }
        return max;
    }
}