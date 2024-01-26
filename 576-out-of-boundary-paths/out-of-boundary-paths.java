class Solution {
    final int mod = 1000000007;
    int[][][] dp;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        dp = new int[m][n][maxMove + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return helper(m, n, maxMove, startRow, startColumn, 0);
    }
    private int helper(int m, int n, int maxMove, int i, int j, int moves) {
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return 1;
        }
        if (moves == maxMove) {
            return 0;
        }
        if (dp[i][j][moves] != -1) {
            return dp[i][j][moves];
        }
        int count = 0;
        count = (count + helper(m, n, maxMove, i + 1, j, moves + 1)) % mod;
        count = (count + helper(m, n, maxMove, i - 1, j, moves + 1)) % mod;
        count = (count + helper(m, n, maxMove, i, j + 1, moves + 1)) % mod;
        count = (count + helper(m, n, maxMove, i, j - 1, moves + 1)) % mod;
        return dp[i][j][moves] = count % mod;
    }
}

---
    // my
    class Solution {
    int ans=0;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        if(maxMove==0) return 0;
        if(startRow==m || startColumn== n || startRow==-1 || startColumn==-1) return 1;
        ans+= findPaths(m,n,maxMove-1,startRow+1,startColumn );
        ans+= findPaths(m,n,maxMove-1,startRow,startColumn+1);
        ans +=findPaths(m,n,maxMove-1,startRow-1,startColumn );
        ans+= findPaths(m,n,maxMove-1,startRow,startColumn-1 );
        return ans;
        }

}
