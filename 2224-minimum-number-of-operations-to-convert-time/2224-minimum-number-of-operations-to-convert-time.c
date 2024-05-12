int convertTime(char* current, char* correct) {
    int a=(current[0]-'0' )*10+(current[1]);
    int b=(current[3]-'0' )*10+(current[4]);
    int c=(correct[0]-'0') *10+(correct[1]);
    int d=(correct[3]-'0') *10+(correct[4]);
    int e=a*60+b;
    int f=c*60+d;
    int count=0;
    int t=abs(f-e);
    count+=t/60;
    t%=60;
    count+=t/15;
    t%=15;
    count+=t/5;
    t%=5;
    count+=t;
    return count;
}