class Solution {
    public boolean areOccurrencesEqual(String s) {
        int max=1;
        char[] arr=s.toCharArray();
        for(int j=1;j<arr.length;j++){
                if(arr[0]==arr[j])max++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='0')continue;
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            if(arr[i]==arr[j]){
                count++;
                arr[j]='0';
            }
            arr[i]='0';
            if(max!=count)return false;
        }
        return true;
    }
}