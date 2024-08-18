class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> heap = new PriorityQueue<>();
        Set<Long> seen = new HashSet<>();
        heap.add(1L);
        seen.add(1L);
        long currentUgly = 1L;
        for (int i = 0; i < n; i++) {
            currentUgly = heap.poll();
            if (seen.add(currentUgly * 2)) heap.add(currentUgly * 2);
            if (seen.add(currentUgly * 3)) heap.add(currentUgly * 3);
            if (seen.add(currentUgly * 5)) heap.add(currentUgly * 5);
        }
        return (int) currentUgly;
    }
}