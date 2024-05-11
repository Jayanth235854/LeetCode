class Solution {
    public int countAsterisks(String s) {
        int count=0,pipe=0,start=0,end;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='|'){
                pipe++;
            }
            if(pipe%2==1)continue;
            if(arr[i]=='*')count++;
        }
        return count;
    }
}