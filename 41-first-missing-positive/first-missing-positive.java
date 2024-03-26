class Solution {
    public int firstMissingPositive(int[] nums) {
        // approach: there are n numbers and sabse chota number will be 1 aur agar 1 se le kr n tab sab number present hai array me to sabse chota number fir hoga n+1.
        // we will not consider numbers<=0 and numbers>n kyuki wo hamara ans ho hi nhi sakta.
        int n=nums.length;
        Boolean one=false;
        for(int i=0;i<n;i++)
        {
            // pahle check kr le rahe hai ki 1 hai ki nhi array me . agar 1 nhi hoga to hamara ans 1 hai.
            if(nums[i]==1)one=true;
            if(nums[i]<=0 || nums[i]>n) nums[i]=1;
            // har number jo <=0 ya >n hai uski jagha 1 dal de rahe hai
        }
        if(one==false) return 1;
        for(int i=0;i<n;i++)
        {
            // yaha karenge ki jo value aai nums[i] pr wo wale index ki value ko -ve kr denge taaki jab baad me traverse kare to pata rahe ki kon sa index nhi visit hua.
          int a=  Math.abs(nums[i]);
          int inx= a-1;
          if(nums[inx]<0)continue;
          nums[inx]*=-1;
        }
        for(int i=0;i<n;i++)
        {
            // agar nums[i]>0 mtlb positive hai iska mtlb we never visited this index iska mtlb i+1 hamare original array me nhi tha. isiliye ans =i+1
            if(nums[i]>0) return i+1;
        }
        return n+1;
    }
}