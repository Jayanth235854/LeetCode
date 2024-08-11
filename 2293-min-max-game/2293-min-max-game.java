class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        int[] newNum = new int[n];
        while (n > 1) {
            int newSize = n / 2;
            for (int i = 0; i < newSize; i++) {
                if (i % 2 == 0) newNum[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                else newNum[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
            }
            nums = newNum;
            n = newSize;
            newNum = new int[n];
        }
        return nums[0];
    }
}
