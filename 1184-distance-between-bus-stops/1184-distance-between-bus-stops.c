int distanceBetweenBusStops(int* distance, int distanceSize, int start, int destination){
    int minDistance(int a, int b) {
    return a < b ? a : b;
}
    int totalDistance = 0;
    for (int i = 0; i < distanceSize; i++) {
        totalDistance += distance[i];
    }
    int clockwiseDistance = 0;
    for (int i = start; i != destination; i = (i + 1) % distanceSize) {
        clockwiseDistance += distance[i];
    }
    int counterclockwiseDistance = totalDistance - clockwiseDistance;
    return minDistance(clockwiseDistance, counterclockwiseDistance);
}