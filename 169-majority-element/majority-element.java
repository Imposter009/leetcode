import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int ans=0;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            m.merge(nums[i],1,Integer::sum);
        }
        for(int i:m.keySet())
        {
            if(m.get(i)>n/2) ans= i;
        }
    return ans;
    }
}