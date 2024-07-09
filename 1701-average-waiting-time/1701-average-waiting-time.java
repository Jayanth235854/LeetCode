class Solution {
    public double averageWaitingTime(int[][] customers) {
        double total = 0;
        int current = 0;

        for (int[] customer : customers) {
            int arrival = customer[0];
            int service = customer[1];
            if (current < arrival) {
                current = arrival;
            }
            int waiting = current - arrival + service;
            total += waiting;
            current += service;
        }
        return total / customers.length;
    }
}