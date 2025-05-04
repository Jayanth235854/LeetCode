class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int[] domino : dominoes) {
            int a = domino[0], b = domino[1];
            int key = a < b ? a * 10 + b : b * 10 + a;
            int val = map.getOrDefault(key, 0);
            count += val;
            map.put(key, val + 1);
        }
        return count;
    }
}