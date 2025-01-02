class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length,m=queries.length,count=0;
        int[] vow=new int[n], ans=new int[m];
        String a="aeiou";
        for(int i=0;i<n;i++){
            int l=words[i].length();
            if(a.contains(String.valueOf(words[i].charAt(0))) && a.contains(String.valueOf(words[i].charAt(l-1)))){
                count++;
                vow[i]=count;
            }
        }
        for(int i=0;i<m;i++){
            int p=queries[i][0],q=queries[i][1];
            if(p!=q){
                int k=vow[q]-p;
                if(k>0) ans[i]=k;
            }else if(vow[p]>0) ans[i]=1;
        }
        return ans;
    }
}