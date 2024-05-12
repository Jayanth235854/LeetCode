class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        int mostFrequentEven = -1;
        for (int num : nums) {
            if (num % 2 == 0) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
                maxFreq = Math.max(maxFreq, freqMap.get(num));
            }
        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                if (mostFrequentEven == -1 || entry.getKey() < mostFrequentEven) {
                    mostFrequentEven = entry.getKey();
                }
            }
        }

        return mostFrequentEven;
    }
}