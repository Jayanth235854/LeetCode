int sumOfMultiples(int n){
    int count=0;
    for(n;n>=1;n--){
        if(n%3==0 || n%5==0 || n%7==0){
            count+=n;
        }
    }
    return count;
}