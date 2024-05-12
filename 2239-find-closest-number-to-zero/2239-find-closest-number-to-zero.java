class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = Integer.MAX_VALUE;
        int closestValue = Integer.MAX_VALUE;
        for (int num : nums) {
            int absDiff = Math.abs(num);
            if (absDiff < closest || (absDiff == closest && num > closestValue)) {
                closest = absDiff;
                closestValue = num;
            }
        }
        return closestValue;
    }
}