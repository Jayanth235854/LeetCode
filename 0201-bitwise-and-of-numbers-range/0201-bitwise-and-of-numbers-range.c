int rangeBitwiseAnd(int left, int right) {
    int a=left,b=right,k=0;
    while(a!=b){
        a>>=1;
        b>>=1;
        k++;
    }
    return a<<k;
}