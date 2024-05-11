class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)return false;
        int num=0,v=0,con=0,other=0;
        char[] arr=word.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=65 && arr[i]<=90){
                if(arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')v++;
                else con++;
            }
            else if(arr[i]>=97 && arr[i]<=122){
                if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')v++;
                else con++;
            }
            else if(arr[i]>=48 && arr[i]<=57)num++;
            else other++;
        }
         return v!=0 && con!=0 && other==0;
    }
}