class Solution {
    public int minimumRecolors(String blocks, int k) {
        int white=0,n=blocks.length(),min=101;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W')white++;
        }
        if(white<min)min=white;
        for(int i=k;i<n;i++){
            if(blocks.charAt(i)=='W')white++;
            if(blocks.charAt(i-k)=='W')white--;
            if(white<min)min=white;
        }
        return min;
    }
}