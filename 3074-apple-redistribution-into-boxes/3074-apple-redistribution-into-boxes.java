class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int n=apple.length, m=capacity.length;
        int sum=0,min=0, csum=0;
        for(int i:apple) sum+=i;
        for(int i=m-1;i>=0;i--){
            csum+=capacity[i];
            min++;
            if(csum>=sum) break;
        }
        return min;
    }
}