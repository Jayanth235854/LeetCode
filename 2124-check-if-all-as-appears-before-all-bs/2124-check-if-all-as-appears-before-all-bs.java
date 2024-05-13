class Solution {
    public boolean checkString(String s) {
        char[] arr=s.toCharArray();
        for(int i=1;i<arr.length;i++){
            if(arr[i]=='a' && arr[i-1]=='b')return false;
        }
        return true;
    }
}