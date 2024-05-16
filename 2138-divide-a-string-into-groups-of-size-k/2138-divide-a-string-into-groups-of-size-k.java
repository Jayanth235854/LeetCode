class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n;
        if(s.length()%k==0){
            n=s.length()/k;
        }else{
            n=s.length()/k+1;
        }
        char[] a=s.toCharArray();
        String[] arr=new String[n];
        int count=0,j=0;
        for(int i=0;i<n;i++)arr[i]="";
        for(int i=0;i<a.length;i++){
            count++;
            if(count>k){
                count=1;
                j++;
            }
            arr[j]=arr[j]+a[i];
        }
        if(arr[n-1].length()!=k){
            int x=arr[n-1].length();
            for(int i=x;i<k;i++)arr[n-1]+=fill;
        }
        return arr;
    }
}