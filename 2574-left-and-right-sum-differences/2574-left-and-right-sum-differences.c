int* leftRightDifference(int* nums, int numsSize, int* returnSize){
    int* leftSum = (int*)malloc(sizeof(int) * numsSize);
    int* rightSum = (int*)malloc(sizeof(int) * numsSize);

    leftSum[0] = 0;
    for (int i = 1; i < numsSize; i++) {
        leftSum[i] = leftSum[i - 1] + nums[i - 1];
    }

    rightSum[numsSize - 1] = 0;
    for (int i = numsSize - 2; i >= 0; i--) {
        rightSum[i] = rightSum[i + 1] + nums[i + 1];
    }

    int* answer = (int*)malloc(sizeof(int) * numsSize);
    for (int i = 0; i < numsSize; i++) {
        answer[i] = abs(leftSum[i] - rightSum[i]);
    }

    *returnSize = numsSize;
    free(leftSum);
    free(rightSum);

    return answer;
}