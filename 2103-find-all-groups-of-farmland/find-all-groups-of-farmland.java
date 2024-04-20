import java.util.*;
class Solution {
    int min_row=Integer.MAX_VALUE;int min_col=Integer.MAX_VALUE;int max_row=Integer.MIN_VALUE;int max_col=Integer.MIN_VALUE;
    int row,col;
    public void sol(int [][] land,int i,int j)
    {
        if(i<0||j<0||j>=col||i>=row|| land[i][j]==0||land[i][j]==-1){
            return;
        }
        {
            land[i][j]=-1;
            min_row=Math.min(min_row,i);
            min_col=Math.min(min_col,j);
            max_row=Math.max(max_row,i);
            max_col=Math.max(max_col,j);
            sol(land,i+1,j);
            sol(land,i-1,j);
            sol(land,i,j+1);
            sol(land,i,j-1);
        }
    }

    public int[][] findFarmland(int[][] land) {
         List <List<Integer>> l=new ArrayList<>();
         row=land.length;
         col=land[0].length;
         
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(land[i][j]==1) {
                sol(land,i,j);
                List<Integer> arr=new ArrayList<>();
                arr.add(min_row);
                arr.add(min_col);
                arr.add(max_row);
                arr.add(max_col);
                l.add(arr);
                
                // Collections.addAll(l,arr);
                min_row=Integer.MAX_VALUE; min_col=Integer.MAX_VALUE; max_row=Integer.MIN_VALUE;
                max_col=Integer.MIN_VALUE;
            }
            }
        }
        // converting list<list<>> into array
        int[][]arry=new int[l.size()][4];
        int i=0,j=0;
        for (List<Integer> row : l) {
            for (int value : row) {
                arry[i][j]=value;
                j++;            }j=0;i++;
        }

        return arry;
    }
}