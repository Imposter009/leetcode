import java.util.*;
class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int min;
        long sum=0;
        for(int i=0;i<n;i++)
        {
            min=arr[i];
            for(int j=i;j<n;j++)
            {
           if(arr[j]<min)
           min=arr[j];
           sum+=min;
            }
            
        }
        return (int)(sum % (Math.pow(10, 9) + 7));
    }
}