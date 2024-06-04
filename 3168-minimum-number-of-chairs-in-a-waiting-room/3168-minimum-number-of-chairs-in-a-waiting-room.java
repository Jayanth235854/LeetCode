class Solution {
    public int minimumChairs(String s) {
        int max=0,chair=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E')chair++;
            else chair--;
            if(chair>max)max=chair;
        }
        return max;
    }
}