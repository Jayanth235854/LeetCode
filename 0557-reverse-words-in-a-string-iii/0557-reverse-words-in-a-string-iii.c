char* reverseWords(char* s) {
    int start=0,end,n=strlen(s);
    for(end=0;end<=n;end++){
        if(s[end]==' ' || s[end]=='\0'){
            for(int i=start,j=end-1;i<j;i++,j--){
                char temp=s[i];
                s[i]=s[j];
                s[j]=temp;
            }
            start=end+1;
        }
    }
    return s;
}