class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        dist={}
        for i in range(len(nums)):
            if(nums[i] in dist and i-dist[nums[i]] <=k):
                return True
            else:
                dist[nums[i]]=i
        return False
        