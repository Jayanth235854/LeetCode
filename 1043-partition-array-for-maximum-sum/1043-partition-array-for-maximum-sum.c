int maxSumAfterPartitioning(int* arr, int arrSize, int k) {
    int* dp = (int*)malloc(sizeof(int) * arrSize);

    for (int i = 0; i < arrSize; i++) {
        int maxVal = 0;
        for (int j = 1; j <= k && i - j + 1 >= 0; j++) {
            maxVal = fmax(maxVal, arr[i - j + 1]);
            dp[i] = fmax(dp[i], (i >= j ? dp[i - j] : 0) + maxVal * j);
        }
    }

    int result = dp[arrSize - 1];
    free(dp);
    return result;

}