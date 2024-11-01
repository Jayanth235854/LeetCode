class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        int c=1;
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i))c++;
            else c=1;
            if(c<=2)sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}