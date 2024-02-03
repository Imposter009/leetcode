import java.util.*;
class Solution {
    public int coinChange(int[] coins, int amount) {
       int n=coins.length;
       int[] dp=new int [amount+1];
    //    ek dp array bana lo jisme humlog har ek amount ke liye min coins store karenge
       Arrays.fill(dp,Integer.MAX_VALUE);
    //    har position pr max value store kr do taki check kr ke min value store kar le baad me
       dp[0]=0;
       for(int i=1;i<=amount;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(i-coins[j]>=0 && dp[i-coins[j]]!=Integer.MAX_VALUE )
            // i-coins[j]>=0 check kr lo ki kahi jo present amount(i) me se agar ek coin ka amount sub karenge to kahi wo less than 0 na ho jaye
            // dp[i-coins[j]]!=Integer.MAX_VALUE check kr lo ki kahi is location ki value max to nhi hai taaki jab hum +1 kare to wo integer over flow na jo jaye
               dp[i]=Math.min(dp[i],1+dp[i-coins[j]]);
            //    har amount ke liye min coins store kr lo. jb coins wala loop end hoga to uske baad we will be having min coins req to get this amount
           }
       }
       if(dp[amount]==Integer.MAX_VALUE) return -1;
       return dp[amount];
    }
}