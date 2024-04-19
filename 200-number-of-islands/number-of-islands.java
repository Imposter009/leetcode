class Solution {
    int m,n;
    public boolean ans(char[][] grid, int i,int j)
    {
        if(i<0 || i>= m || j<0 || j>= n || grid[i][j]=='0' || grid[i][j]=='&') return true;
        if(grid[i][j]=='1') {
         grid[i][j]='&';
        if(ans(grid,i+1,j) && ans(grid,i-1,j)&& ans(grid,i,j+1) && ans(grid,i,j-1)) return true;
        }
        return false;
       }
    public int numIslands(char[][] grid) {
         m=grid.length;
         n=grid[0].length;
         int anss=0;
         boolean res;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1') { res=ans(grid,i,j);
                if(res=true) anss+=1;}
            }
        }
        return anss;
    }
}