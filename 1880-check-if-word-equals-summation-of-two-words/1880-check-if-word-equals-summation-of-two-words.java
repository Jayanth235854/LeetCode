class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int a=0,b=0,c=0;
        for(int i=0;i<firstWord.length();i++){
            int num=firstWord.charAt(i)-'a';
            a=a*10+num;
        }
        for(int i=0;i<secondWord.length();i++){
            int num=secondWord.charAt(i)-'a';
            b=b*10+num;
        }
        for(int i=0;i<targetWord.length();i++){
            int num=targetWord.charAt(i)-'a';
            c=c*10+num;
        }
        int tot=a+b;
        return tot==c;
    }
}