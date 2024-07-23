class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] freq=new int[101];
        for(int i=0;i<nums.size();i++){
            for(int j=nums.get(i).get(0);j<=nums.get(i).get(1);j++){
                freq[j]++;
            }
        }
        int count=0;
        for(int i=1;i<=100;i++){
            if(freq[i]>0)count++;
        }
        return count;
    }
}