class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        if(len(nums)<3):
            return max(nums)
        num=set(nums)
        new=list(num)
        new.sort()
        print(new)
        n=len(new)
        if(n==1):
            return new[0]
        if(n==2):
            return new[1]
        return new[len(new)-3]
        