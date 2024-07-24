char* clearDigits(char* s) {
    static char ans[101];
    int n=strlen(s),i=0,j=0;
    while(i<n){
        if(s[i]>='0' && s[i]<='9'){
            ans[--j]='\0';
        }
        else ans[j++]=s[i];
        i++;
    }
    ans[j]='\0';
    return ans;
}