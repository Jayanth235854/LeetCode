int** flipAndInvertImage(int** image, int imageSize, int* imageColSize, int* returnSize, int** returnColumnSizes) {
    int** result = (int**)malloc(sizeof(int*) * imageSize);
    *returnSize = imageSize;
    *returnColumnSizes = (int*)malloc(sizeof(int) * imageSize);

    for (int i = 0; i < imageSize; i++) {
        result[i] = (int*)malloc(sizeof(int) * (*imageColSize));
        (*returnColumnSizes)[i] = *imageColSize;

        for (int j = 0; j < *imageColSize; j++) {
            result[i][j] = 1 - image[i][(*imageColSize - 1) - j];
        }
    }

    return result;
}
void printMatrix(int** matrix, int rows, int cols) {
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            printf("%d ", matrix[i][j]);
        }
        printf("\n");
    }
}