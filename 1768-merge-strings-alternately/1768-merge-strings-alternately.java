class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] w1=word1.toCharArray(), w2=word2.toCharArray();
        int m=w1.length, n=w2.length;
        int min=m<n?m:n;
        StringBuilder a= new StringBuilder();
        for(int i=0;i<min;i++) {
            a.append(w1[i]).append(w2[i]);
        }
        if(m-min!=0) for(int i=min;i<m;i++)a.append(w1[i]);
        if(n-min!=0) for(int i=min;i<n;i++)a.append(w2[i]);
        return a.toString();
    }
}