class Solution {
    public int possibleStringCount(String word) {
        int n=word.length(), count=0;
        for(int i=0;i<n-1;i++){
            int temp=0;
            while(i<n-1 && word.charAt(i)==word.charAt(i+1)){
                temp++;
                i++;
            }
            count+=temp;
        }
        return count+1;
    }
}