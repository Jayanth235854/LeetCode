class Solution {
    public int findLucky(int[] arr) {
     int[] frequency = new int[501];
        for (int num : arr) {
            frequency[num]++;
        }
        for (int i = 500; i >= 1; i--) {
            if (frequency[i] == i) {
                return i;
            }
        }
        return -1;   
    }
}