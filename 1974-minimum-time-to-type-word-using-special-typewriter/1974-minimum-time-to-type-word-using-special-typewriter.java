class Solution {
    public int minTimeToType(String word) {
        int count=word.length();
        char pre='a';
        for(int i=0;i<word.length();i++){
            char cur=word.charAt(i);
            int dif=Math.abs(cur-pre);
            count+=Math.min(dif,26-dif);
            pre=cur;
        }
        return count;
    }
}