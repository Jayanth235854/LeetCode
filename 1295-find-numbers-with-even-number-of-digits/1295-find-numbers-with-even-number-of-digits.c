int findNumbers(int* nums, int numsSize) {
    int count = 0;
    for (int i = 0; i < numsSize; i++) {
        int num = nums[i];
        int digitCount = 0;
        while (num != 0) {
            num /= 10;
            digitCount++;
        }
        if (digitCount % 2 == 0) {
            count++;
        }
    }
    return count;
}