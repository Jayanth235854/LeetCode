class Solution {
    public int minimumPushes(String word) {
        char[] arr=word.toCharArray();
        int n=word.length(), count=0,pro=1;
        int[] freq=new int[26];
        for(int i=0;i<n;i++)freq[arr[i]-'a']++;
        Arrays.sort(freq);
        for(int i=0;i<26;i++)System.out.print(freq[i]+" ");
        int l=25,ans=0;
        while(freq[l]!=0){
            count++;
            if(count>8){
                pro++;
                count=1;
            }
            ans=ans+pro*freq[l];
            l--;
            if(l==-1)break;
        }
        return ans;
    }
}