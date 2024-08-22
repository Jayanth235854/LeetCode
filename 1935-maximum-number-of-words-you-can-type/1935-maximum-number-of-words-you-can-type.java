class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String arr[] =text.split(" ");
        char[] ch=brokenLetters.toCharArray();
        int n=arr.length;
        int c=n;
        for(int i=0;i<brokenLetters.length();i++){
            String a=String.valueOf(ch[i]);
            for(int j=0;j<n;j++){
                if(arr[j]==null) continue;
                if(arr[j].contains(a)){
                    c--;
                    arr[j]=null;
                }
            }
        }
        return c;
    }
}