bool canPlaceFlowers(int* flowerbed, int flowerbedSize, int n) {
    int count = 0;
    
    for (int i = 0; i < flowerbedSize; i++) {
        if (flowerbed[i] == 0) {
            int prev = (i == 0) ? 0 : flowerbed[i - 1];
            int next = (i == flowerbedSize - 1) ? 0 : flowerbed[i + 1];
            
            if (prev == 0 && next == 0) {
                flowerbed[i] = 1;
                count++;
                i++;
            }
        }
    }

    return count >= n;
}