bool isPalindrome(int x) {
    double reverse=0;
    int original=x;
    while(x>0){
        int digit=x%10;
        x/=10;
        reverse=reverse*10+digit;
    }
    return original==reverse;
}