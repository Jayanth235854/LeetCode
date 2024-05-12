bool canWinNim(int n) {
    if(n<=3)return true;
    int k=n/2;
    if(k%2==1)return true;
    else if(n%2==1)return true;
    else return false;
}