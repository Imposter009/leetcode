class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int len=nums.length;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<len;i++)
        {
            int val=Math.abs(nums[i]);
            // taking abs value bec agar pahle se negative value mile to jab inx nikalne ke liye -1 karenge to add ho jayega
            int inx=val-1;
            if(nums[inx]<0) l.add(val);
            else nums[inx]*=-1;
        }
        return l;
    }
}