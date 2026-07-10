class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        arr=[]
        if not nums:
            return arr
        p=nums[0]
        for i in range(1,len(nums)):
            if(nums[i]!=nums[i-1]+1):
                if(nums[i-1]==p):
                    arr.append(str(p))
                else:
                    arr.append(f"{p}->{nums[i-1]}")
                p=nums[i]
        if(nums[-1]==p):
            arr.append(str(nums[-1]))
        else:
            arr.append(f"{p}->{nums[-1]}")
        return arr