class Solution {
    public int trap(int[] height) {
        int currentindex=1,lastindex=height.length-2,result=0;
        while(currentindex<=lastindex){
            int leftmax=0;
            for(int leftindex=0;leftindex<currentindex;leftindex++){
                leftmax=Math.max(leftmax,height[leftindex]);
            }
            int rightmax=0;
            for(int rightindex=currentindex+1;rightindex<height.length;rightindex++){
                rightmax=Math.max(rightmax,height[rightindex]);
            }
            int trap=Math.min(leftmax,rightmax);
            int trappingwater=trap-height[currentindex];
            if(trappingwater>0)result+=trappingwater;
            currentindex++;
        }
        return result;
    }
}