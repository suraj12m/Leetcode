class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        c=nums.count(0)
        nums[:]=[x for x in nums if(x!=0)]
        nums.extend([0 for _ in range(c)])
        
        