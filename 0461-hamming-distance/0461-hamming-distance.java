class Solution {
    public int hammingDistance(int x, int y) {
        int k= x^y;
        String a=Integer.toBinaryString(k);
        char[] arr=a.toCharArray();
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='1')c++;
        }
        return c;
    }
}