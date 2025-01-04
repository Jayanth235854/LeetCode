class Solution {
    public int countPalindromicSubsequence(String s) {
        int n=s.length(),ans=0;
        Set<Character> hs=new HashSet();
        for(int i=0;i<n;i++){
            hs.add(s.charAt(i));
        }
        for(char ch:hs){
            int i=0,j=n-1;
            while(s.charAt(i)!=ch)i++;
            while(s.charAt(j)!=ch)j--;
            if(i==j)continue;
            Map<Character,Integer> hm=new HashMap();
            for(int p=i+1;p<j;p++){
                char a=s.charAt(p);
                hm.put(a,hm.getOrDefault(a,0)+1);
            }
            ans+=hm.size();
        }
        return ans;
    }
}