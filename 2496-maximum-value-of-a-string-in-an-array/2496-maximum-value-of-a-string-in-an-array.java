class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for (String str : strs) {
            if (str != null && !str.isEmpty()) {
                int c = 0;
                if (str.matches("\\d+")) c = Integer.parseInt(str);
                else c = str.length();
                max = Math.max(c, max);
            }
        }
        return max;
    }
}