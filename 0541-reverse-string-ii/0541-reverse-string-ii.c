char* reverseStr(char* s, int k) {
    int m=strlen(s);
    if(m==1||k==1)return s;
    if(k>m){
        for(int i=0,j=m-1;i<=j;i++,j--){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
        return s;
    }
    for(int i=0,j=k-1;i<=j;i++,j--){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
    for (int i = 2 * k; i < m; i += 2 * k) {
        int start = i;
        int end = (i + k - 1 < m) ? i + k - 1 : m - 1;
        for (int x = start, y = end; x <= y; x++, y--) {
            char temp = s[x];
            s[x] = s[y];
            s[y] = temp;
        }
    }
    return s;
}