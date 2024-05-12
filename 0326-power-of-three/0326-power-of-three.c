bool isPowerOfThree(int n) {
    if(((n>0)&(n-1)==(n-1))&&(1162261467 % n == 0)){
        return true;
    }
    else{
        return false;
    }
}