bool checkRecord(char* s) {
    int l=0,a=0,lmax=0;
        for(int i=0;i<strlen(s);i++){
            if(s[i]=='L')l++;
            else if(s[i]=='A'){
                a++;
                if(l>lmax)lmax=l;
                l=0;
            }else {
                if(l>lmax)lmax=l;
                l=0;
            }
        }
        if(l>lmax)lmax=l;
        if(a<2 && lmax<3)return true;
        else return false;
}