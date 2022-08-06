class Solution {
    public int minPathSum(int[][] grid) {
        int row=grid.length;
            int column=grid[0].length;
            int [][] results= new int [row][column];
            results[0][0]=grid[0][0];
            for(int i=1;i<row;i++)
            {
                results[i][0]=grid[i][0]+results[i-1][0];
                System.out.println(results[i][0]);
            }
            
            for(int j=1;j<column;j++)
            {
                results[0][j]=grid[0][j]+results[0][j-1];
            }
            
            for(int i=1;i<row;i++)
            {
                for(int j=1;j<column;j++)
                {
                    results[i][j]=results[i-1][j]>results[i][j-1]?results[i][j-1]+grid[i][j]:results[i-1][j]+grid[i][j];
                }
            }
            
            return results[row-1][column-1];
}}