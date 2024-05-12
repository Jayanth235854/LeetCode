int subtractProductAndSum(int n) {
    int i;
    int sum=0,product=1;
    while(n>0){
        int a=n%10;
        n/=10;
        sum+=a;
        product*=a;
    }
    return product-sum;
}