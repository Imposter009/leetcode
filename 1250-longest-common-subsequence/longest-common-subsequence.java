class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
     int m=text1.length();
     int n=text2.length();
     int [][]a=new int [m+1][n+1];   
     for(int i=0;i<m+1;i++)
     for(int j=0;j<n+1;j++)
     {
         if(j==0||i==0)
         {
             a[i][j]=0;
         }
         else if(text1.charAt(i-1)==text2.charAt(j-1)) a[i][j]=a[i-1][j-1]+1;
         else a[i][j]=Math.max(a[i-1][j],a[i][j-1]);
     }
    
    return a[m][n];
    }
}