/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* spiralOrder(int** matrix, int matrixSize, int* matrixColSize, int* returnSize) {
    int top=0;
    int bottom=matrixSize-1;
    int left=0;
    int right=*matrixColSize-1;
    int *res=(int *)malloc(sizeof(int)*matrixSize*(*matrixColSize));
    *returnSize=0;
    while(left<=right && top<=bottom)
    {
        //step-1
        for(int i=left;i<=right;i++)
        {
            res[(*returnSize)++]=matrix[top][i];
        }
        top++; 
        //step-2
        for(int i=top;i<=bottom;i++)
        {
            res[(*returnSize)++]=matrix[i][right];
        }
        right--;
        //step-3
        if(top<=bottom)
        {
            for(int i=right;i>=left;i--)
            {
                res[(*returnSize)++]=matrix[bottom][i]; 
            }
            bottom--;
        }
        //step-4
        if(left<=right)
        {
            for(int i=bottom;i>=top;i--)
            {
                res[(*returnSize)++]=matrix[i][left];
            }
            left++;
        }
    }
    return res;
}