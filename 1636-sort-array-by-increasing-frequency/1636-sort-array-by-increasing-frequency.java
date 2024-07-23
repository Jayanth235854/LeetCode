class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        } 
        List<Integer> sortedList = new ArrayList<>();
        for (int num : nums) {
            sortedList.add(num);
        }
        sortedList.sort((a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);
            if (freqA != freqB) {
                return Integer.compare(freqA, freqB);
            } else {
                return Integer.compare(b, a);
            }
        });
        int[] result = new int[nums.length];
        for (int i = 0; i < sortedList.size(); i++) result[i] = sortedList.get(i);

        return result;
    }
}