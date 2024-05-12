int* distributeCandies(int candies, int num_people, int* returnSize) {
    int* result = (int*)malloc(num_people * sizeof(int));
    for (int i = 0; i < num_people; ++i) {
        result[i] = 0;
    }

    int give = 1;
    while (candies > 0) {
        for (int i = 0; i < num_people && candies > 0; ++i) {
            result[i] += (candies > give) ? give : candies;
            candies -= give;
            give++;
        }
    }

    *returnSize = num_people;
    return result;
}