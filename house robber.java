import java.util.*;

class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
       if( n==1 ){
            return nums[0];
        }else if(n == 0){
            return 0;
        }else if(n == 2){
            return Math.max(nums[0],nums[1]);
        }
        
        int dp[] = new int[n];// isme hum max loot store karenge.
        dp[0] = nums[0]; //agar 1 element hoga to bs 1 hi way hai lootne ka
        dp[1] = nums[1];// gar 2 element hai to ya to 0 ya 1 wala lootega
        dp[2] = nums[2] + nums[0];// 2nd har ko lootega to uske paas bs 1 non adjacent house hoga jo hai 0
        for(int i=3;i<n;i++){
            //3rd house ko jb lootega to uske paas option hoga ya to 1st house(n-2) ko loote ya 0 house ko(n-3) for max loot.
            dp[i] = Math.max(dp[i-2],dp[i-3]) + nums[i];
        }
        
        return Math.max(dp[n-1],dp[n-2]);

    }
}