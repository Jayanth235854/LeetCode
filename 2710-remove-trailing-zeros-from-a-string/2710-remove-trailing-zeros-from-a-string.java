class Solution {
    public String removeTrailingZeros(String num) {
        char[] ar=num.toCharArray();
        for(int i=num.length()-1;i>=0;i--){
            if(ar[i]=='0'){
                ar[i]='-';
            }
            else break;
        }
        String arr="";
        for(int i=0;i<ar.length;i++){
            if(ar[i]=='-')break;
            arr+=ar[i];
        }
        return arr;
    }
}