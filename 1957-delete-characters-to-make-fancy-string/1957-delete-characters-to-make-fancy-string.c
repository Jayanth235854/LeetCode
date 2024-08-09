char* makeFancyString(char* s) {
    int n=strlen(s),c=1,k=0;
    char arr[n];
    arr[k++]=s[0];
    for(int i=0;i<n-1;i++){
        if(s[i]==s[i+1])c++;
        else c=1;
        if(c<3)arr[k++]=s[i+1];
    }
    s[k]='\0';
    for(int i=0;i<k;i++)s[i]=arr[i];
    return s;;
}