class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder(s);
        int n=part.length(), i=0;
        while(i<sb.length() && sb.length()-i>=n){
            if(sb.substring(i,i+n).equals(part)){
                System.out.println(sb.substring(i,i+n));
                sb.delete(i,i+n);
                i=0;
            }else i++;
        }
        return sb.toString();
    }
}