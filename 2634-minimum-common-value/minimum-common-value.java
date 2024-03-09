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
-------------------------------------------------------------------------------------------------------------------------------------------
    // Approach-2 (Using Binary Search)
// T.C : O(mlogn)
// S.C : O(1)
class Solution {
    public boolean binarySearch(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return false;
    }

    public int getCommon(int[] nums1, int[] nums2) {
        for (int num : nums1) {
            if (binarySearch(nums2, num)) {
                return num;
            }
        }

        return -1;
    }
}
