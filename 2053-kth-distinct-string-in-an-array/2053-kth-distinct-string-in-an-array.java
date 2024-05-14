class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i].equals("0"))continue;
            int c=0;
            for(int j=i+1;j<n;j++){
                if(arr[i].equals(arr[j])){
                    c++;
                    arr[j]="0";
                }
            }
            if(c>0)arr[i]="0";
        }
        int count=0;
        String res="";
        for(int i=0;i<n;i++){
            if(arr[i].equals("0"))continue;
            else count++;
            if(count==k){
                res=arr[i];
                break;
            }
        }
        return res;
    }
}