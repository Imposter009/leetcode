class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subs=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<Math.pow(2,n);i++)
        {
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if(((1<<j)&i) !=0) list.add(nums[j]);
            }
            subs.add(list);
        }
        return subs;
    }
}