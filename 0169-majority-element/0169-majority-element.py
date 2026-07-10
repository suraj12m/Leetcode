class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        ans=nums[0]
        for i in range(1,len(nums)):
            if(nums[i-1]==nums[i]):
                continue
            else:
                if(nums.count(nums[i])>nums.count(ans)):
                    ans=nums[i]
        return (ans)

        