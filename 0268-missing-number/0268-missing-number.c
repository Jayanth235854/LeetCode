int missingNumber(int* nums, int numsSize) {
    int sum=(numsSize*(numsSize+1))/2;
    int total=0;
    for(int i=0;i<numsSize;i++){
        total+=nums[i];
    }
    return sum-total;
}