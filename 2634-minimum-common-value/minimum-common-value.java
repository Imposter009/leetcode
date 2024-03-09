class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer>l=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            l.add(nums1[i]);
        }
        int ans=-1;
        for(int i=0;i<nums2.length;i++)
        {
            if(l.contains(nums2[i]))
            {
                ans=nums2[i];
                break;
            }
        }
    return ans;
    }
}