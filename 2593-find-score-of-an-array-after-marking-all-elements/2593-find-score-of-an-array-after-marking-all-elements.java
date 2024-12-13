import java.util.*;

class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;
        long ans = 0;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (i1, i2) -> Integer.compare(nums[i1], nums[i2]));
        boolean[] taken = new boolean[n];
        for (int i = 0; i < n; i++) {
            int index = indices[i];
            if (!taken[index]) {
                ans += nums[index];
                taken[index] = true;
                if (index > 0) taken[index - 1] = true; 
                if (index < n - 1) taken[index + 1] = true;
            }
        }
        return ans;
    }
}
