class Solution {
    public int findMaxK(int[] nums) {
        int max=-1;
        Set<Integer> s=new HashSet<>();
        for(int v:nums){
            if(s.contains(-v)) max=Math.max(Math.abs(v),max);
             s.add(v);
            }
        
        return max;
    }
}