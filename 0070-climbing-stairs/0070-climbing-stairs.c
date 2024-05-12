int climbStairs(int n) {
    int n1=1,n2=2,nth;
    if(n<=2)return n;
    for(int i=3;i<=n;i++){
        nth=n1+n2;
        n1=n2;
        n2=nth;
    }
    return nth;
}