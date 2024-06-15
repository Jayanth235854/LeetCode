class Solution {
    public int[] constructRectangle(int area) {
        int l=0,w=0;
        for(int i=(int)Math.sqrt(area);i>0;i--){
            if(area%i==0){
                w=i;
                l=area/i;
                break;
            }
        }
        int[] ans=new int[]{l,w};
        return ans;
    }
}