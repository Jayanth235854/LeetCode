class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> a=new ArrayList<>();
        int n=words.length;
        for(int i=1;i<n;i++){
            int[] freq1=new int[26];
            char[] arr=words[i].toCharArray();
            for(int k=0;k<arr.length;k++)freq1[arr[k]-'a']++;
            if(words[i].length()!=words[i-1].length())continue;
            int[] freq2=new int[26];
            char[] arr1=words[i-1].toCharArray();
            for(int k=0;k<arr1.length;k++)freq2[arr1[k]-'a']++;
            int c=0;
            for(int k=0;k<arr1.length;k++){
                if(freq1[arr1[k]-'a']!=freq2[arr1[k]-'a']){
                    c++;
                    break;
                }
            }
            if(c==0){
                words[i]=words[i-1];
                words[i-1]="a";
            }
        }
        for(int i=0;i<n;i++){
            if(words[i]!="a")a.add(words[i]);
        }
        return a;
    }
}