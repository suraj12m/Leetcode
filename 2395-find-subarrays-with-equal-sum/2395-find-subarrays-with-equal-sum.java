class Solution {
    public boolean findSubarrays(int[] nums) 
    {
        int i,j,s=0;
        for(i=0;i<nums.length-1;i++)
        {
            s=nums[i]+nums[i+1];
            for(j=0;j<i;j++)
            {
                if(s==nums[j]+nums[j+1])
                    return true;
            }
        }
        return false; 
    }
}