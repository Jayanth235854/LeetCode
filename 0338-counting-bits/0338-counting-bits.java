class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=1;i<=n;i++){
            int c=0;
            String a=Integer.toBinaryString(i);
            char[] ch=a.toCharArray();
            for(int j=0;j<ch.length;j++){if(ch[j]=='1')c++;}
            arr[i]=c;
        }
        return arr;
    }
}