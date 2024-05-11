class Solution {
    public int trap(int[] height) {
        int[] leftmax=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }

        int[] rightmax=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        int result=0;
        for(int i=0;i<height.length;i++){
            int holding=Math.min(rightmax[i],leftmax[i])-height[i];
            if(holding>0)result+=holding;
        }
        return result;
    }
}