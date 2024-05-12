int kthFactor(int n, int k) {
    int list[n],count=-1;
    for(int i=1;i<=n;i++){
        if(n%i==0){
            list[++count]=i;
        }
    }
    if(count+1<k)return -1;
    return list[k-1];
}