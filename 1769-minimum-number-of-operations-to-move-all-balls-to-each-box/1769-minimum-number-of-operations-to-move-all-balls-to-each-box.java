class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int ans=0;
            for(int j=0;j<n;j++){
                if(i==j)continue;
                if(boxes.charAt(j)=='1')ans+=Math.abs(i-j);
            }
            arr[i]=ans;
        }
        return arr;
    }
}