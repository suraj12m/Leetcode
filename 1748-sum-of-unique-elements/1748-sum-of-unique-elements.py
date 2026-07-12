class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        ans=sum(x for x in nums if(nums.count(x)==1))
        return ans