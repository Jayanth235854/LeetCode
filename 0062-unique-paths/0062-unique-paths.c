int uniquePaths(int m, int n) {
    int N=m+n-2;
    int r=m-1;
    double f=1.0;
    for(int i=1;i<=r;i++){
        f=f*(N-r+i)/i;
    }
    return (int)f;
}