class Solution {
    public int[] rearrangeArray(int[] nums) {
      int l=nums.length;
      int [] p=new int[l/2];
      int [] n=new int[l/2];
      int pi=0,ni=0;
      for(int i=0;i<l;i++)
      {
          if(nums[i]>0)p[pi++]=nums[i];
          else n[ni++]=nums[i];
      }
      int j=0;
      for(int i=0;i<pi;i++)
      {
          nums[j++]=p[i];
          nums[j++]=n[i];
      }
return nums;
    }
}