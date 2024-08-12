class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=0,cons=0, n=blocks.length();
        for(int i=0;i<k;i++) if(blocks.charAt(i)=='W')cons++;
        min=cons;
        for(int i=k;i<n;i++){
            if(blocks.charAt(i)=='W')cons++;
            if(blocks.charAt(i-k)=='W')cons--;
            if(min>cons)min=cons;
        }
        return min;
    }
}