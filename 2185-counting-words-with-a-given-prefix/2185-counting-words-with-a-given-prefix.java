class Solution {
    public int prefixCount(String[] words, String pref) {
        int n=words.length, l=pref.length(), ans=0;
        for(int i=0;i<n;i++){
            if(words[i].length()>=l && words[i].substring(0,l).equals(pref)) ans++;
        }
        return ans;
    }
}