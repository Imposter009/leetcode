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
-----------------------------------------------------------------------------------------
    //Approach-2 (Without nested loop)
//T.C : O(n)
//S.C : O(n)
public class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        int i = 0;
        int j = 0;
        int result = 0;
        
        int culprit = 0;
        
        while(j < n) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            
            if(map.get(nums[j]) == k + 1) {
                culprit++;
            }
            
            if(culprit > 0) {
                map.put(nums[i], map.get(nums[i]) - 1);
                if(map.get(nums[i]) == k) {
                    culprit--;
                }
                i++;
            }
            
            if(culprit == 0) {
                result = Math.max(result, j - i + 1);
            }
            j++;
        }
        
        return result;
    }
}
