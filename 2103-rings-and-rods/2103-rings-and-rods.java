class Solution {
    public int countPoints(String rings) {
        char[] arr=rings.toCharArray();
        int[] num=new int[]{1,1,1,1,1,1,1,1,1,1};
        for(int i=0;i<arr.length;i+=2){
            if(arr[i]=='R') num[arr[i+1]-'0']*=2;
            else if(arr[i]=='G') num[arr[i+1]-'0']*=3;
            else num[arr[i+1]-'0']*=5;
        }
        int count=0;
        for(int i=0;i<10;i++){
            if(num[i]%30==0)count++;
        }
        return count;
    }
}