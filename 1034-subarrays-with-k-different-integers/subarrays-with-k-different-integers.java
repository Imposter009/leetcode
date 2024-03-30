class Solution {
    
    // Total count of subarrays having <= k distinct elements
    public int slidingWindow(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        int n = nums.length;
        int i = 0; 
        int j = 0;
        
        int count = 0;
        
        while(j < n) {
            
            mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1);
            
            while(mp.size() > k) {
                // Shrink the window
                mp.put(nums[i], mp.get(nums[i]) - 1);
                if(mp.get(nums[i]) == 0) {
                    mp.remove(nums[i]);
                }
                i++;
            }
            
            count += (j - i + 1); // Ending at j
            j++;
        }
        
        return count;
    }
    
    public int subarraysWithKDistinct(int[] nums, int k) {
        return slidingWindow(nums, k) - slidingWindow(nums, k - 1);
    }
}
/*
notes::: jab hum j-i+1 karte hai to wo humko total number of subarrays possible between i and j , ending at j deta hai. to isme ye ho sakta hai ki kuch subarrayas aise ho jisme no of different element less than k ho ya equal to k ho, humko bs equal wale chaiye isliye humko less than k wale hatane padenge. isko hatane ke liye humko number of subarrays with atmost k different elements me se number of subarrays having atmost k-1 different elements ko substract karna padega.
isliye humlogo ne sliding window ka alag fun bana liya jo humko number of subarrays de raha hai jisme atmost k different elements honge.
*/