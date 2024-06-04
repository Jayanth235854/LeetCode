class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1)return 1;
        int[] arr=new int[125];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        int total=0,odd=0;
        for(int i=64;i<125;i++){
            if(arr[i]%2==0)total=total+arr[i];
            else{
                total=total+arr[i]-1;
                odd++;
            }
        }
        if(odd>0)return total+1;
        return total;
    }
}