class Solution {
    public String toLowerCase(String s) {
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='A' && arr[i]<='Z')arr[i]=Character.toLowerCase(arr[i]);
        }
        String ans=new String(arr);
        return ans;
    }
}