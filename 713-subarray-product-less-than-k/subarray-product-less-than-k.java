class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
         if (k <= 1)
            return 0;
        
        int n = nums.length;
        int count = 0;
        int p=1;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                p*=nums[j];
                if(p<k)count++;
                else break;
            }
            p=1;
        }
        return count;
    }
}