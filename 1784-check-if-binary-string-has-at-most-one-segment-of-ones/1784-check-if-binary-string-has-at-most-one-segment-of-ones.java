class Solution {
    public boolean checkOnesSegment(String s) {
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]=='1' && arr[i]=='0')return false;
        }
        return true;
    }
}