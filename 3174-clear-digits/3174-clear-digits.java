class Solution {
    public String clearDigits(String s) {
        int n=s.length();
        char[] arr=s.toCharArray();
        for(int i=0;i<n;i++){
            if(arr[i]=='-')continue;
            if(arr[i]>='0' && arr[i]<='9'){
                for(int j=i-1;j>=0;j--){
                    if(arr[j]=='-')continue;
                    if(arr[j]>='A'){
                        arr[i]='-';
                        arr[j]='-';
                        break;
                    }
                }
            }
        }
        String a="";
        for(int i=0;i<n;i++){
            if(arr[i]=='-')continue;
            a+=arr[i];
        }
        return a;
    }
}