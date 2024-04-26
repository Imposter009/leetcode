class Solution {
    int n;
    int[][] t = new int[201][201]; // Using 2D array for memoization

    public int solve(int row, int col, int[][] grid) {
        if (row == n - 1) {
            return grid[row][col];
        }

        if (t[row][col] != -1) {
            return t[row][col];
        }

        int ans = Integer.MAX_VALUE;
        for (int nextCol = 0; nextCol < n; nextCol++) {
            if (nextCol != col) {
                ans = Math.min(ans, solve(row + 1, nextCol, grid));
            }
        }

        return t[row][col] = grid[row][col] + ans;
    }

    public int minFallingPathSum(int[][] grid) {
        n = grid.length;
        for (int i = 0; i < t.length; i++) {
            Arrays.fill(t[i], -1); // Initialize memoization table
        }

        int result = Integer.MAX_VALUE;
        for (int col = 0; col < n; col++) {
            result = Math.min(result, solve(0, col, grid));
        }

        return result;
    }
}