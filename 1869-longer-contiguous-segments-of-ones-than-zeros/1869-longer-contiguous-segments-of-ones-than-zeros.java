class Solution {
    public boolean checkZeroOnes(String s) {
        int one=0,zero=0,co=0,cz=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='1'){
                if(zero<cz)zero=cz;
                co++;
                cz=0;
            }else{
                if(one<co)one=co;
                cz++;
                co=0;
            }
            if(i==arr.length-1){
                if(zero<cz)zero=cz;
                if(one<co)one=co;
            }
        }
        return one>zero?true:false;
    }
}