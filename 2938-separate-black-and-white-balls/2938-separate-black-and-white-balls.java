class Solution {
    public long minimumSteps(String s) {
        long countOnes = 0; // Count of '1's encountered (use long)
        long swaps = 0; // Total swaps needed (use long)
        for (char c : s.toCharArray()) {
            if (c == '1') {
                countOnes++; // Increment count of '1's
            } else {
                swaps += countOnes; // Add current count of '1's to swaps
            }
        }
        return swaps; // Return the total number of swaps needed
    }
}
