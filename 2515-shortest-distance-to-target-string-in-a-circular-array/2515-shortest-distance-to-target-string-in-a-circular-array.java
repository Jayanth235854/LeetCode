class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int out=120,count=0,n=words.length,left=0;
        if(words[startIndex].equals(target))return 0;
        for(int i=startIndex;i<n+startIndex;i++){
            count++;
            if(words[(i+1)%n].equals(target)){
                if(count<out)out=count;
                break;
            }
        }
        for(int i=startIndex;i>=-n/2;i--){
            left++;
            if(words[(i-1+n)%n].equals(target)){
                if(left<out)out=left;
                break;
            }
        }
        if(out==120)return -1;
        return out;
    }
}