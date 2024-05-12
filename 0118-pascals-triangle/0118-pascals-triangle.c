int** generate(int numRows, int* returnSize, int** returnColumnSizes) {
    *returnSize = numRows;

    int** result = (int**)malloc(numRows * sizeof(int*));
    *returnColumnSizes = (int*)malloc(numRows * sizeof(int));

    for (int i = 0; i < numRows; i++) {
        result[i] = (int*)malloc((i + 1) * sizeof(int));
        (*returnColumnSizes)[i] = i + 1;

        result[i][0] = result[i][i] = 1;

        for (int j = 1; j < i; j++) {
            result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
        }
    }

    return result;
}
void printTriangle(int** triangle, int numRows, int* returnColumnSizes) {
    printf("[\n");
    for (int i = 0; i < numRows; i++) {
        printf("  [");
        for (int j = 0; j < returnColumnSizes[i]; j++) {
            printf("%d", triangle[i][j]);
            if (j < returnColumnSizes[i] - 1) {
                printf(",");
            }
        }
        printf("]");
        if (i < numRows - 1) {
            printf(",");
        }
        printf("\n");
    }
    printf("]\n");
}