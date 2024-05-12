int max(int a,int b){
    return a>b?a:b;
}
int findMaxConsecutiveOnes(int* nums, int numsSize) {
    int maxCount = 0, count = 0; 
    for (int i = 0; i < numsSize; i++) {
        if (nums[i] == 1) {
            count++;
        } else {
            maxCount = max(maxCount, count);
            count=0;
        }
    }
    maxCount = max(maxCount, count);
    return maxCount;
}