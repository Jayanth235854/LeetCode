class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = 0;
        int lastPoisonedTime = -1;
        for (int i = 0; i < timeSeries.length; i++) {
            if (timeSeries[i] > lastPoisonedTime) {
                count += duration;
            } else {
                count += timeSeries[i] + duration - 1 - lastPoisonedTime;
            }
            lastPoisonedTime = timeSeries[i] + duration - 1;
        }
        return count;
    }
}