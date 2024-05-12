bool uniqueOccurrences(int* arr, int arrSize) {
    int count[2001] = {0};
    for (int i = 0; i < arrSize; i++) {
        count[arr[i] + 1000]++;
    }
    int occurrences[1001] = {0};
    for (int i = 0; i < 2001; i++) {
        if (count[i] > 0) {
            if (occurrences[count[i]] > 0) {
                return false;
            }
            occurrences[count[i]]++;
        }
    }
    return true;
}