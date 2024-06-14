class Solution {
    public int minimumMoves(String s) {
        char[] arr=s.toCharArray();
        int count=0,n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]=='O')continue;
            else{
                count++;
                if(i+2<n){
                    arr[i]='O';
                    arr[i+1]='O';
                    arr[i+2]='O';
                }else break;
            }
        }
        return count;
    }
}