class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] ans=new int[2];
        if(n<10){
            ans[0]=1;
            ans[1]=n-1;
            return ans;
        }
        for(int i=1;i<n/2;i++){
            int a=i,b=n-i;
            String s=Integer.toString(b);
            char[] arr=s.toCharArray();
            String si=Integer.toString(a);
            char[] arri=si.toCharArray();
            int l=arr.length,c=0,d=0,li=arri.length;
            for(int j=0;j<l;j++){
                if(arr[j]=='0'){
                    c++;
                    break;
                }
            }
            for(int k=0;k<li;k++){
                if(arri[k]=='0'){
                    d++;
                    break;
                }
            }
            if(c==0 && d==0){
                ans[0]=a;
                ans[1]=b;
                return ans;
            }
        }
        return ans;
    }
}