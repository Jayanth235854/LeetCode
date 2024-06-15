class Solution {
    public int distributeCandies(int[] candyType) {
        int repeat=0,n=candyType.length;
        Arrays.sort(candyType);
        for(int i=0;i<n-1;i++){
            if(candyType[i]==candyType[i+1])repeat++;
        }
        int left=n-repeat;
        if(n/2>=left)return left;
        return n/2;
    }
}