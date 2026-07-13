class Solution {
    public int pivotIndex(int[] nums) {
        int ans=-1;
        for(int i=0;i<nums.length;i++)
        {
            int s1=0,s2=0;
            for(int j=0;j<i;j++) 
                s1+=nums[j];
            for(int j=i+1;j<nums.length;j++)
                s2+=nums[j];
            if(s1==s2)
            {
                ans=i;
                break;
            }

        }
        return ans;
    }
}