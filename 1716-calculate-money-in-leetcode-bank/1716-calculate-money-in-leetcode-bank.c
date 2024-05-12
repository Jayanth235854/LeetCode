int totalMoney(int n) {
    int total=0;
    int mondayIncrement=1;
    for(int i=1;i<=n;i++){
        total+=(i-1)%7+mondayIncrement;
        if(i%7==0)mondayIncrement++;
    }
    return total;
}