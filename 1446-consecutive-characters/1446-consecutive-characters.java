class Solution {
    public int maxPower(String s) {
        char[] arr=s.toCharArray();
        int max=0;
        if(arr.length==1)return 1;
        for(int i=0;i<arr.length-1;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }else break;
            }
            if(count>max)max=count;
        }
        return max;
    }
}