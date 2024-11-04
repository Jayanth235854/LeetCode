class Solution {
    public String compressedString(String word) {
        int c=1,n=word.length();
        String a="";
        for(int i=1;i<n;i++){
            if(c==9){
                a=a+"9"+word.charAt(i-1);
                c=0;
            }
            if(word.charAt(i-1)==word.charAt(i))c++;
            else{
                if(c==0){
                    c++;
                    continue;
                }
                String l=Integer.toString(c);
                a=a+l+word.charAt(i-1);
                c=1;
            }
        }
        a=a+Integer.toString(c)+word.charAt(n-1);
        return a;
    }
}