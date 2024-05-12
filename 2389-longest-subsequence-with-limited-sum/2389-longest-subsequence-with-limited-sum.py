class Solution:
    def answerQueries(self, nums: List[int], queries: List[int]) -> List[int]:
        nums.sort()
        n=len(nums)
        q=len(queries)
        answer=[0]*q
        for i in range(q):
            count=0
            sum_=0
            for j in range(n):
                sum_+=nums[j]
                if(sum_<=queries[i]):
                    count+=1
            answer[i]=count
        return answer