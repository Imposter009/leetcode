class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>l=new HashSet<>();
        Set<Integer>li=new HashSet<>();
        for(int n:nums1)
        {
            l.add(n);
        }
        for(int n:nums2)
        {
            if(l.contains(n))
            {
                li.add(n);
            }
        }
        int[]ans=new int[li.size()];
        int i=0;
        for(int n:li)
        {
            ans[i]=n;
            i++;
        }
        return ans;
    }
}