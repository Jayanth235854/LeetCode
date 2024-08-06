class Solution {
    public String[] findWords(String[] words) {
        String as="qwertyuiop";
        String bs="asdfghjkl";
        String cs="zxcvbnm";
        int[] freq1= new int[26], freq2=new int[26], freq3=new int[26];
        for(int i=0;i<10;i++)freq1[as.charAt(i)-'a']++;
        for(int i=0;i<9;i++)freq2[bs.charAt(i)-'a']++;
        for(int i=0;i<7;i++)freq3[cs.charAt(i)-'a']++;
        int n=words.length;
        List<String> str=new ArrayList<>();
        for(int i=0;i<n;i++){
            int a1=0,b1=0,c1=0;
            String l=words[i].toLowerCase();
            for(int j=0;j<l.length();j++){
                if(freq1[l.charAt(j)-'a']>0)a1++;
                if(freq2[l.charAt(j)-'a']>0)b1++;
                if(freq3[l.charAt(j)-'a']>0)c1++;
            }
            if(a1==l.length() || b1==l.length() || c1==l.length())str.add(words[i]);
        }
        String[] ans=new String[str.size()];
        for(int i=0;i<str.size();i++)ans[i]=str.get(i);
        return ans;
    }
}