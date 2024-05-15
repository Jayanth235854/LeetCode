class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] arr=new int[27];
        char[] ch=sentence.toCharArray();
        for(int i=0;i<ch.length;i++){
            arr[ch[i]-96]++;
        }
        for(int i=1;i<27;i++){
            if(arr[i]==0)return false;
        }
        return true;
    }
}