class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int maxpos=-1;
        int minpos=-1;
        int culprit=-1;
        int len=nums.length;
        long ans=0;
        int j=0;
        while(j<len)
        {
            if(nums[j]==minK)minpos=j;
            if(nums[j]==maxK)maxpos=j;
            if(nums[j]>maxK || nums[j]<minK)culprit=j;
            int m=Math.min(maxpos,minpos);
            int t=m-culprit;
            ans+=t<=0?0:t;
            j++;
        }
    return ans;
    }
}