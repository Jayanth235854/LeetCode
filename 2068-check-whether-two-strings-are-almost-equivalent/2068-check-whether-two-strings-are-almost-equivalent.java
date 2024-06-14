class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] w1=new int[125];
        int[] w2=new int[125];
        char[] ar1=word1.toCharArray();
        char[] ar2=word2.toCharArray();
        for(int i=0;i<ar1.length;i++){
            w1[ar1[i]]++;
            w2[ar2[i]]++;
        }
        for(int i=97;i<123;i++){
            if(Math.abs(w1[i]-w2[i])>3)return false;
        }
        return true;
    }
}