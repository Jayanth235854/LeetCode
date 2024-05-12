int buyChoco(int* prices, int pricesSize, int money){
    int min1 = INT_MAX, min2 = INT_MAX;
    for (int i = 0; i < pricesSize; i++) {
        if (prices[i] < min1) {
            min2 = min1;
            min1 = prices[i];
        } else if (prices[i] < min2) {
            min2 = prices[i];
        }
    }
    int cost = min1 + min2;
    return money - cost >= 0 ? money - cost : money;
}