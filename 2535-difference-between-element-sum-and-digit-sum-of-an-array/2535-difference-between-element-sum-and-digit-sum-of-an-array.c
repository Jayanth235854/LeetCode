int differenceOfSum(int* nums, int numsSize) {
    int element = 0;
    for (int i = 0; i < numsSize; i++) {
        element += nums[i];
    }

    int digit = 0;
    for (int i = 0; i < numsSize; i++) {
        int currentNum = nums[i];
        int digitSum = 0;
        
        while (currentNum != 0) {
            digitSum += currentNum % 10;
            currentNum /= 10;
        }

        digit += digitSum;
    }

    return element - digit;
}