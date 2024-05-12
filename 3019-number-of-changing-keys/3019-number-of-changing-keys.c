int countKeyChanges(char* s) {
    int n=strlen(s);
    int k=n-1;
    for(int i=0;i<n;i++){
        if(s[i+1]==s[i]+32){
            k--;
        }
        else if(s[i+1]==s[i]-32){
            k--;
        }
        else if(s[i]==s[i+1]){
            k--;
        }
    }
    return k;
}