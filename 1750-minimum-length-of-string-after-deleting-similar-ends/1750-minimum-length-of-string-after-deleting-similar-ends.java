class Solution {
    public int minimumLength(String s) {
        int left = 0,count=0;
        int right = s.length() - 1;
        if(right==0)return 1;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[0]==arr[i])count++;
        }
        if(count==arr.length)return 0;
        while (left < right && s.charAt(left) == s.charAt(left + 1)) {
            left++;
        }
        
        while (left < right && s.charAt(right) == s.charAt(right - 1)) {
            right--;
        }
        
        while (left < right && s.charAt(left) == s.charAt(right)) {
            char ch = s.charAt(left);
            while (left <= right && s.charAt(left) == ch) {
                left++;
            }
            while (left <= right && s.charAt(right) == ch) {
                right--;
            }
        }
        return right - left + 1;
    }
}
