int arrangeCoins(int n) {
    int k = n,i=1;
    while(k>0){
        if(k==i)return i;
        k-=i;
        i++;
    }

    return i-2;
}