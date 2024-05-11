class Solution {
    public int findComplement(int num) {
        String s=Integer.toBinaryString(num);
        char[] arr=s.toCharArray();
        String a="";
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='1')arr[i]='0';
            else arr[i]='1';
            a+=arr[i];
        }
        int ans=Integer.parseInt(a,2);
        return ans;
    }
}