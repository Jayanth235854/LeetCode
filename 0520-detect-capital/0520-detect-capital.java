class Solution {
    public boolean detectCapitalUse(String word) {
        int c=0;
        char[] arr=word.toCharArray();
        for(int i:arr){
            if(i>=65 && i<=90)c++;
        }
        if(c==arr.length)return true;
        else if(c==1 && arr[0]>=65 && arr[0]<=90)return true;
        else if(c==0)return true;
        return false;
    }
}