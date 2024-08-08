class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        if(n<5){
            int c=1;
            for(int i=1;i<n;i++){
                if(arr[i-1]==arr[i])c++;
                else{
                    if(c>1)return arr[i-1];
                    c=1;
                }
            }
            if(c>1)return arr[n-1];
        }
        double per=n*.25, c=1;
        for(int i=1;i<n;i++){
            if(arr[i-1]==arr[i])c++;
            else{
                if(c>per)return arr[i-1];
                c=1;
            }
        }
        if(c>per)return arr[n-1];
        return 0;
    }
}