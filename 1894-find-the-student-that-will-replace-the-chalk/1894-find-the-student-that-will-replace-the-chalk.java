class Solution {
    public int chalkReplacer(int[] chalk, int k) {
       long totalChalk = 0;
        for (int c : chalk) {
            totalChalk += c;
        }
        k %= totalChalk;        
        int i = 0;
        while (k >= chalk[i]) {
            k -= chalk[i];
            i++;
        }        
        return i;    
    }
}