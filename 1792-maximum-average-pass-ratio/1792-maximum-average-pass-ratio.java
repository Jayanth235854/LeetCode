class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        int n = classes.length;]
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            double gainA = (double)(a[0] + 1) / (a[1] + 1) - (double)a[0] / a[1];
            double gainB = (double)(b[0] + 1) / (b[1] + 1) - (double)b[0] / b[1];
            return Double.compare(gainB, gainA);
        });
        for (int[] classInfo : classes) pq.offer(classInfo);
        for (int i = 0; i < extraStudents; i++) {
            int[] currentClass = pq.poll();
            currentClass[0] += 1;
            currentClass[1] += 1;
            pq.offer(currentClass);
        }
        double totalRatio = 0.0;
        for (int[] classInfo : classes) {
            totalRatio += (double) classInfo[0] / classInfo[1];
        }
        return totalRatio / n;
    }
}