class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        ind=1
        dup=1
        for i in range(1,len(nums)):
            if(nums[i]==nums[i-1]):
                dup+=1
            else:
                dup=1
            if dup<3:
                nums[ind]=nums[i]
                ind+=1
        return ind