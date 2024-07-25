/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

void merger(int arr[],int start, int mid, int end){
    int ls=mid+1-start, rs=end-mid;
    int la[ls], ra[rs];
    for(int i=0;i<ls;i++)la[i]=arr[i+start];
    for(int j=0;j<rs;j++)ra[j]=arr[mid+1+j];
    int i=0,j=0,k=start;
    while(i<ls && j<rs){
        if(la[i]<ra[j]) arr[k++]=la[i++];
        else arr[k++]=ra[j++];
    }
    while(i<ls)arr[k++]=la[i++];
    while(j<rs)arr[k++]=ra[j++];
}

void mergesort(int arr[], int start, int end){
    if(start<end){
        int mid=(start+end)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid+1,end);
        merger(arr,start,mid,end);
    }
}

int* sortArray(int* nums, int numsSize, int* returnSize) {
    *returnSize = numsSize;
    mergesort(nums,0,numsSize-1);
    return nums;
}