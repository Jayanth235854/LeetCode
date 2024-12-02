class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr=sentence.split(" ");
        int n=arr.length,e=searchWord.length()-1;;
        for(int i=0;i<n;i++){
            if(arr[i].contains(searchWord)){
                if((arr[i].charAt(0))==(searchWord.charAt(0)) && (arr[i].charAt(e))==(searchWord.charAt(e))) return i+1;
            }
        }
        return -1;
    }
}