int xorOperation(int n, int start) {
    int num[n],a=0;
    for(int i=0;i<n;i++){
        num[i]=start+2*i;
    }
    for(int i=0;i<n;i++){
        a^=num[i];
    }
    return a;
}