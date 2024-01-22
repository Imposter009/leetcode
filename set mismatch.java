import java.util.*;
class Solution {
    public int[] findErrorNums(int[] nums) {
        Set <Integer> a=new HashSet<>();
        int n=nums.length;
        int []res=new int[2];
        for(int i=0;i<n;i++)
        {
            if(!a.contains(nums[i])) a.add(nums[i]);
            else res[0]=nums[i];
        }
        for(int i=1;i<=n;i++)
        {
            if(!a.contains(i)) res[1]=i;
        }
        return res;
    }
}
----
class Solution {
    public int[] findErrorNums(int[] nums) {
        int N = nums.length, sum = N * (N + 1) / 2;
        int[] result = new int[2];
        boolean[] seen = new boolean[N+1];
        for (int num : nums) {
            sum -= num;
            if (seen[num]) result[0] = num;
            seen[num] = true;
        }
        result[1] = sum + result[0];
        return result;
    }
}