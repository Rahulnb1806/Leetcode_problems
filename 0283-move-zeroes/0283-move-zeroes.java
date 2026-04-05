class Solution {
    public void moveZeroes(int[] nums) {
        int t=0;
        for(int i=0;i<=nums.length-1;i++)
        {
            if(nums[i]!=0)
            {
                int tmp=nums[i];
               nums[i]=nums[t];
               nums[t]=tmp;
               t++;
            }
        }
    }
}