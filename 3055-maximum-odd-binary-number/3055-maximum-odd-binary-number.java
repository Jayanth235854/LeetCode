class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] arr=s.toCharArray();
        int one=0,zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='0')zero++;
            else if(arr[i]=='1')one++;
        }
        String r="";
        if(one==1){
            for(int i=0;i<zero;i++){
                r=r+"0";
            }
            r=r+"1";
            return r;
        }
        for(int i=1;i<one;i++){
            r=r+"1";
        }
        for(int i=0;i<zero;i++){
            r=r+"0";
        }
        r=r+"1";
        return r;
    }
}