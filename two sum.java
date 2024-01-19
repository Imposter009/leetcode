import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> s=new HashMap<>();
        int[] c=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(!s.containsKey(target-nums[i])){s.put(nums[i],i);}
            else
            {
                int a=nums[i];
                int b=target-nums[i];
                c[0]=i;
                c[1]=s.get(b);
               break;
            }
            }return c;
    }
}