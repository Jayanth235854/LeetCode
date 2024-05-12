bool strongPasswordCheckerII(char* password) {
    int l=strlen(password);
    if(l<8) return false;
    bool low=false,upper=false,digit=false,special=false;
    char special1[]="!@#$%^&*()-+";
    for(int i=0;i<l;i++){
        if(password[i]>='a' && password[i]<='z'){
            low=true;
        }
        else if(password[i]>='A' && password[i]<='Z'){
            upper=true;
        }
        else if(password[i]>='0' && password[i]<='9'){
            digit=true;
        }
        else if(strchr(special1,password[i])!=NULL){
            special=true;
        }
    }
    for(int i=0;i<l-1;i++){
        if(password[i]==password[i+1]){
            return false;
        }
    }
    return low && upper && digit && special;
}