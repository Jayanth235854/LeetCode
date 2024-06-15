class Solution {
    public int bitwiseComplement(int n) {
        String a=Integer.toBinaryString(n);
        char[] arr=a.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='1')arr[i]='0';
            else arr[i]='1';
        }
        String as=new String(arr);
        int ans=Integer.parseInt(as,2);
        return ans;
    }
}