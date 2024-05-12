class Solution:
    def divideArray(self, nums: List[int], k: int) -> List[List[int]]:
        n = len(nums)
        nums.sort()
        for i in range(2, n, 3):
            if nums[i] - nums[i - 2] > k:
                return []

        result = [nums[i:i + 3] for i in range(0, n, 3)]
        return result