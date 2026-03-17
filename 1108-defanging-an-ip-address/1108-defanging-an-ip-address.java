class Solution {
    public String defangIPaddr(String add) {
        String s="[.]";
        for(int i=0;i<add.length();i++){
            if(add.charAt(i)=='.'){
                String a=add.substring(0,i);
                String b=add.substring(i+1);
                add=a+s+b;
                i+=2;
            }
        }
        return add;
    }
}