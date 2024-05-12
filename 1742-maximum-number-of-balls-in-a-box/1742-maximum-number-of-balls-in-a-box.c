int getDigitSum(int num) {
    int sum = 0;
    while (num > 0) {
        sum += num % 10;
        num /= 10;
    }
    return sum;
}
int countBalls(int lowLimit, int highLimit) {
    int freq[100] = {0}; // Assuming the sum of digits won't exceed 100
    int maxBalls = 0;
    for (int i = lowLimit; i <= highLimit; i++) {
        int box = getDigitSum(i);
        freq[box]++;
        maxBalls = (freq[box] > maxBalls) ? freq[box] : maxBalls;
    }
    return maxBalls;
}