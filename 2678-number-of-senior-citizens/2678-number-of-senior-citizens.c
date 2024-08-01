int countSeniors(char ** details, int detailsSize){
    int count=0;
    for(int i=0;i<detailsSize;i++){
        int a=details[i][11]-'0';
        int b=details[i][12]-'0';
        int num=a*10+b;
        if(num>60)count++;
    }
    return count;
}