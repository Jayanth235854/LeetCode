class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int n=ranges.length;
        LinkedHashSet<Integer> e = new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            for(int j=ranges[i][0]; j<=ranges[i][1];j++)e.add(j);
        }
        int count=right-left+1, c=0;
        Iterator it=e.iterator();
        while(it.hasNext()){
            int a=(int)it.next();
            if(a>=left && a<=right)c++;
        }
        return c==count;
    }
}