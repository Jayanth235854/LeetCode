class Solution {
    public int getLucky(String s, int k) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            int a=s.charAt(i)-'a'+1;
            while(a>0){
                ans+=a%10;
                a/=10;
            }
        }
        k-=1;
        while(k>0){
            k--;
            int a=ans;
            ans=0;
            while(a>0){
                ans+=a%10;
                a/=10;
            }
        }
        return ans;
    }
}