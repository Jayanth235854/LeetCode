class Solution {
    public long coloredCells(int n) {
        long val=(long)n;
        long ans=(val*val) +(val-1)*(val-1);
        return ans;
    }
}