class Solution {
      public int uniquePathsWithObstacles(int[][] obstacleGrid) {
          int row =obstacleGrid.length;
        int column=obstacleGrid[0].length;
        
          
        if(obstacleGrid[row-1][column-1]==1)
            return 0;
         if(obstacleGrid[0][0]==1)
             return 0;
         
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                if (obstacleGrid[i][j]==1)
                    obstacleGrid[i][j]=-1;
            }
        }
          
        
        for (int i=0;i<row;i++)
        {   
            if( obstacleGrid[i][0]==-1)
                break;
                        obstacleGrid[i][0]=1;
        }
        for (int j=0;j<column;j++)
        {
            if(obstacleGrid[0][j]==-1) 
                break;
            obstacleGrid[0][j]=1;
        }
     
        for (int i=1;i<row;i++)
        {
            for (int j=1;j<column;j++)
            {
                if(obstacleGrid[i][j]==-1) continue;
                
                if(obstacleGrid[i-1][j]!=-1&&obstacleGrid[i][j-1]!=-1)
                {
                    obstacleGrid[i][j]=obstacleGrid[i-1][j]+obstacleGrid[i][j-1];   
                }
                else if(obstacleGrid[i-1][j]==-1&&obstacleGrid[i][j-1]==-1)
                     obstacleGrid[i][j]=0 ;
                else if (obstacleGrid[i][j-1]==-1)
                    obstacleGrid[i][j]=obstacleGrid[i-1][j];
                else if (obstacleGrid[i-1][j]==-1)
                    obstacleGrid[i][j]=obstacleGrid[i][j-1];
                
                
            }
        }
          
        return obstacleGrid[row-1][column-1];
}}