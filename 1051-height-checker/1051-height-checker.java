class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int[] expect=new int[n];
        for(int i=0;i<n;i++){
            expect[i]=heights[i];
        }
        int count=0;
        Arrays.sort(expect);
        for(int i=0;i<n;i++){
            if(heights[i]!=expect[i])count++;
        }
        return count;
    }
}