class Solution {
    public String getSmallestString(String s) {
        char[] arr=s.toCharArray();
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int a=arr[i]-'0';
            int b=arr[i+1]-'0';
            int p=a%2 , q=b%2;
            if(p==q && a>b){
                char temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                break;
            }
        }
        return new String(arr);
    }
}