class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int[] arr=new int[rectangles.length];
        int maxi=0;
        for(int i=0;i<rectangles.length;i++){
            arr[i]=Math.min(rectangles[i][0],rectangles[i][1]);
            if(arr[i]>maxi)maxi=arr[i];
        }
        int count=0;
        for(int i=0;i<rectangles.length;i++){
            if(maxi==arr[i])count++;
        }
        return count;
    }
}