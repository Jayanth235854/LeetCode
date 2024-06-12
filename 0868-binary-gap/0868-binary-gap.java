class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        char[] arr=s.toCharArray();
        int count=0,max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='1'){
                if(count>max)max=count;
                count=1;
            }else count++;
        }
        return max;
    }
}