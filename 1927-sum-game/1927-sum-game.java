class Solution {
    public boolean sumGame(String num) {
        int q=0,l=num.length(),sum=0;
        char[] arr=num.toCharArray();
        for(char ch:arr){
            if(ch=='?')q++;
            else sum=sum+(ch-'0');
        }
        int lq=0,rq=0,ls=0,rs=0;
        for(int i=0;i<l/2;i++){
            if(num.charAt(i)=='?') lq++;
            else ls=ls+(num.charAt(i)-'0');
        }
        rq=q-lq;
        rs=sum-ls;
        return (ls-rs)*2 != (rq-lq)*9;
    }
}