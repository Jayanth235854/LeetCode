class Solution {
    public String getEncryptedString(String s, int k) {
        String a="";
        int n=s.length();
        for(int i=0;i<n;i++){
            int l=(i+k)%n;
            a+=s.charAt(l);
        }
        return a;
    }
}