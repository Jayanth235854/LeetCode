class Solution {
    public String longestPalindrome(String s) {
        char[] ch=s.toCharArray();
        int n=ch.length,max=1, x=0,y=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int c=0, a=i,b=j, l=b-a+1;
                while(a<b){
                    if(ch[a]!=ch[b]){
                        c++;
                        break;
                    }
                    a++; b--;
                }
                if(c==0 && l>max){
                    x=i; y=j;
                    max=l;
                }
            }
        }
        return s.substring(x,y+1);
    }
}