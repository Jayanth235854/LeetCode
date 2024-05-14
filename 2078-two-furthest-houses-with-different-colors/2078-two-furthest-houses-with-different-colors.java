class Solution {
    public int maxDistance(int[] colors) {
        int left=0,right=colors.length-1,res=0;
        while(left<right){
            if(colors[left]==colors[right])right--;
            else {
                res=right-left;
                break;
            }
        }
        left=0;
        right=colors.length-1;
        while(left<right){
            if(colors[left]==colors[right])left++;
            else{
                int r=right-left;
                if(r>res)res=r;
                break;
            }
        }
        return res;
    }
}