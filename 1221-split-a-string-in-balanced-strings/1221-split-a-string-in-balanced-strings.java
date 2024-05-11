class Solution {
    public int balancedStringSplit(String s) {
        int result=0,count=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='L')count++;
            else count--;
            if(count==0)result++;
        }
        return result;
    }
}