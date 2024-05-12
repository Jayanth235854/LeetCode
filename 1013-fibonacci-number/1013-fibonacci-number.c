int fib(int n){
    int n1=0,n2=1,nth;
    if(n==0)return 0;
    else if(n==1)return 1;
    for(int i=2;i<=n;i++){
        nth=n1+n2;
        n1=n2;
        n2=nth;
    }
    return nth;
}