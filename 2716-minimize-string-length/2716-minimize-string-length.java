class Solution {
    public int minimizedStringLength(String s) {
        char[] arr=s.toCharArray();
        int l=arr.length,count=0;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(arr[i]=='0')continue;
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]='0';
                }
            }
        }
        return l-count;
    }
}