int addDigits(int num) {
    int remain=0;
    while(num>0){
      int digit=num%10;
      remain=remain+digit;
      num/=10;
    }
    num=remain;
    int temp=0;
    while(num>0){
      int digit=num%10;
      temp=temp+digit;
      num/=10;
    }
    num=temp;
    int var=0;
    while(num>0){
      int digit=num%10;
      var=var+digit;
      num/=10;
    }
    return var;
}