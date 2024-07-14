int countSegments(char* s) {
    int n=strlen(s),count=0;
    for(int i=1;i<=n;i++){
        if(s[i]==' ' && s[i-1]!=' ' || (s[i-1]!=' ' && s[i]=='\0'))count++;
    }
    return count;
}