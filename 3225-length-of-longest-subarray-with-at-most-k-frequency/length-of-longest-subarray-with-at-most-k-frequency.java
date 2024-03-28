class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        // typical sliding window problem
        int len=nums.length;
        int i=0,j=0;
        int ans=0;
        Map<Integer,Integer>mp=new HashMap<>();
        while(j<len)
        {
            mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
            if(mp.get(nums[j])>k)
            {
                while(i<j && mp.get(nums[j])>k)
                {mp.put(nums[i],mp.get(nums[i])-1);
                i++;}
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}