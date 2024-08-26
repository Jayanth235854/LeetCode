class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> weightMap = new TreeMap<>();
        for (int[] item : items1) {
            weightMap.put(item[0], weightMap.getOrDefault(item[0], 0) + item[1]);
        }
        for (int[] item : items2) {
            weightMap.put(item[0], weightMap.getOrDefault(item[0], 0) + item[1]);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : weightMap.entrySet()) {
            result.add(Arrays.asList(entry.getKey(), entry.getValue()));
        }
        return result;
    }
}