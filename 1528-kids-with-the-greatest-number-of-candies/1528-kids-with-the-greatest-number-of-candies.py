class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        arr=[]
        l=max(candies)
        for i in candies:
            if i+extraCandies>=l:
                arr.append(True)
            else :
                arr.append(False)
        return arr