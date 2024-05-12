class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int n=mainTank,a=additionalTank,c=0;
        if(n<5)return n*10;
        while(n>0){
            if(n/5!=0){
                n=n-5;
                c+=5;
                if(a>0){
                    n=n+1;
                    a--;
                }
            }else{
                c+=n;
                n=n-n;
            }
        }
        return c*10;
    }
}