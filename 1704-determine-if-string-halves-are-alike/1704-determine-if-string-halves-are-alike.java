class Solution {
    public boolean halvesAreAlike(String s) {
        char[] arr=s.toCharArray();
        int first=0,second=0,n=arr.length;
        for(int i=0;i<n/2;i++){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u')first++;
            else if(arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U')first++;
        }
        for(int i=n/2;i<n;i++){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u')second++;
            else if(arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U')second++;
        }
        return first==second;
    }
}