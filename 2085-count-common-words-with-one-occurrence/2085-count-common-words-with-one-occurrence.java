class Solution {
    public int countWords(String[] words1, String[] words2) {
        int m=words1.length,n=words2.length;
        for(int i=0;i<m;i++){
            if(words1[i].equals("0"))continue;
            int c=0;
            for(int j=i+1;j<m;j++){
                if(words1[i].equals(words1[j])){
                    c++;
                    words1[j]="0";
                }
            }
            if(c>0)words1[i]="0";
        }
        for(int i=0;i<n;i++){
            if(words2[i].equals("0"))continue;
            int c=0;
            for(int j=i+1;j<n;j++){
                if(words2[i].equals(words2[j])){
                    c++;
                    words2[j]="0";
                }
            }
            if(c>0)words2[i]="0";
        }
        int count=0;
        for(int i=0;i<m;i++){
            if(words1[i].equals("0"))continue;
            for(int j=0;j<n;j++){
                if(words1[i].equals(words2[j]))count++;
            }
        }
        return count;
    }
}