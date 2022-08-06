class Solution {
    public int uniquePaths(int m, int n) {
        int[] [] uniqPath=new int [m][n];
        for(int i=0 ;i<m;i++)
            uniqPath[i][0]=1;
        
        for (int j=0;j<n;j++)
            uniqPath[0][j]=1;
        
        for(int i=1 ;i<m;i++)
        {
            for (int j=1;j<n;j++)
            {
                 uniqPath[i][j]= uniqPath[i-1][j]+ uniqPath[i][j-1];
            }
           
        
        }
        return uniqPath[m-1][n-1];
           
    }
}