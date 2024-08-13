class Solution {
    public int countGoodSubstrings(String s) {
        char[] arr=s.toCharArray();
        int n=s.length(), count=0;
        for(int i=2;i<n;i++){
            if(arr[i]!=arr[i-1] && arr[i-1]!=arr[i-2] && arr[i]!=arr[i-2])count++;
        }
        return count;
    }
}