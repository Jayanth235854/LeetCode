class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int n=words.length;
        String[] a=new String[n];
        for(int i=0;i<n;i++){
            a[i]="";
            for(int j=0;j<words[i].length();j++){
                a[i]=a[i]+(arr[words[i].charAt(j)-97]);
            }
        }
        int c=n;
        for(int i=0;i<n;i++){
            if(a[i].equals("0"))continue;
            for(int j=i+1;j<n;j++){
                if(a[i].equals(a[j])){
                    c--;
                    a[j]="0";
                }
            }
        }
        return c;
    }
}