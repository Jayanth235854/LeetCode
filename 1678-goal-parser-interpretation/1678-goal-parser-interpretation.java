class Solution {
    public String interpret(String c) {
        String s="";
        for(int i=0;i<c.length();i++){
            if(c.charAt(i)=='G')s+="G";
            else if(c.charAt(i)=='(' && c.charAt(i+1)==')'){
                s+="o"; i++;
            }else{
                s+="al";
                i+=3;
            }
        }
        return s;
    }
}