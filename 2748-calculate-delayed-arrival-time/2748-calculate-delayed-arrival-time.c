int findDelayedArrivalTime(int arrivalTime, int delayedTime){
    int a=arrivalTime+delayedTime;
    if(a>=24)return abs(24-a);
    return a;
}