class Solution {
    public int maximumSwap(int num) {
        String a=Integer.toString(num);
        int n=a.length(), temp=0, l=0;
        int[] arr=new int[n];
        for(char ch:a.toCharArray()) arr[l++]=ch-'0';
        int[] freq=new int[10];
        for(int i=0;i<n;i++) {
            freq[arr[i]]++;
        }
        int i=0, j=9;
        while(i!=n && j>=0){
            if(freq[j]==0)j--;
            else if(arr[i]!=j){
                temp=arr[i];
                arr[i]=j;
                break;
            }else{
                i++; freq[j]--;
            }
        }
        for(int k=n-1;k>i;k--){
            if(arr[k]==j){
                arr[k]=temp;
                break;
            }
        }
        int ans=0, k=0;
        while(k!=n){
            ans=ans*10+arr[k++];
        }
        return ans;
    }
}