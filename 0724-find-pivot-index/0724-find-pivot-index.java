class Solution {
    public int pivotIndex(int[] nums) {
        int t=0;
        for(int i=0;i<nums.length;i++)
        {
            t+=nums[i];
        }
        int l=0;
        for(int i=0;i<nums.length;i++)
        {
            if(l==t-l-nums[i])
            return i;
            l+=nums[i];
        }
        return -1;
    }
}