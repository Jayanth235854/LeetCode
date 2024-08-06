class Solution {
    public boolean backspaceCompare(String s, String t) {
        int m=s.length(), n=t.length();
        char[] a=s.toCharArray(), b=t.toCharArray();
        for(int i=0;i<m;i++){
            if(a[i]=='#'){
                a[i]='1';
                for(int j=i-1;j>=0;j--){
                    if(a[j]!='1'){
                        a[j]='1';
                        break;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            if(b[i]=='#'){
                b[i]='1';
                for(int j=i-1;j>=0;j--){
                    if(b[j]!='1'){
                        b[j]='1';
                        break;
                    }
                }
            }
        }
        String p="",q="";
        for(int i=0;i<m;i++)if(a[i]!='1')p+=a[i];
        for(int i=0;i<n;i++)if(b[i]!='1')q+=b[i];
        return p.equals(q);
    }
}