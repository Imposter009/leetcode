class Solution {
    public int maxFrequencyElements(int[] nums) {
       if(nums.length == 1)
            return 1;
        Map<Integer, Integer> hm = new HashMap<>();
        int c = 0, max=0, ans=0;
        for(int n : nums) {
            c = hm.getOrDefault(n, 0) + 1;
            hm.put(n, c);
            if(max == c){
                ans += max;
            }else if(max < c) {
                max = c;
                ans = c;
            }
        }
        return ans;
    }
}