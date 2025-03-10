class Solution {
    public long countOfSubstrings(String word, int k) {
        int a=0,e=0,i=0,o=0,u=0,cons=0,n=word.length(),count=0;
        for(int j=0;j<5+k;j++){
            if(word.charAt(j)=='a')a++;
            else if(word.charAt(j)=='e')e++;
            else if(word.charAt(j)=='i')i++;
            else if(word.charAt(j)=='o')o++;
            else if(word.charAt(j)=='u')u++;
            else cons++;
        }
        if(a>0 && e>0 && i>0 && o>0 && u>0 && cons==k) count++;
        for(int j=5+k;j<n;j++){
            if(word.charAt(j-5-k)=='a')a--;
            else if(word.charAt(j-5-k)=='e')e--;
            else if(word.charAt(j-5-k)=='i')i--;
            else if(word.charAt(j-5-k)=='o')o--;
            else if(word.charAt(j-5-k)=='u')u--;
            else cons--;
            if(word.charAt(j)=='a')a++;
            else if(word.charAt(j)=='e')e++;
            else if(word.charAt(j)=='i')i++;
            else if(word.charAt(j)=='o')o++;
            else if(word.charAt(j)=='u')u++;
            else cons++;
            if(a>0 && e>0 && i>0 && o>0 && u>0 && cons==k) count++;
        }
        return count;
    }
}