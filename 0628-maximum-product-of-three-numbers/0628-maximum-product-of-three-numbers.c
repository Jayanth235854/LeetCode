int compare(const void*a , const void*b){
    return *(int*)a - *(int*)b;
}
int maximumProduct(int* nums, int numsSize) {
    qsort(nums,numsSize, sizeof(2), compare);
    for(int i=0;i<numsSize;i++)printf("%d ",nums[i]);
    int a=nums[0]*nums[1]*nums[numsSize-1];
    int b=nums[numsSize-1]*nums[numsSize-2]*nums[numsSize-3];
    int max=a>b?a:b;
    return max;
}