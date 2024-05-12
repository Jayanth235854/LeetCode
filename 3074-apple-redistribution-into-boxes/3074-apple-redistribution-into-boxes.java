class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(apple);
        Arrays.sort(capacity);
        int n=apple.length;
        int m=capacity.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=apple[i];
        }
        int count=0,total=0;;
        for(int i=m-1;i>=0;i--){
            total+=capacity[i];
            count++;
            if(total>=sum){
                return count;
            }
        }
        return 0;
    }
}