class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int c=0,n=words.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int a=words[i].length(),b=words[j].length();
                if(a<=b){
                    String pre=words[j].substring(0,a);
                    String suf=words[j].substring(b-a);
                    if(pre.equals(words[i]) && suf.equals(words[i]))c++;
                }
            }
        }
        return c;
    }
}