class Solution {
       public int[][] matrixReshape(int[][] mat, int r, int c) {
           int[][] res=new int [r][c];
           
           if(r*c !=mat.length*mat[0].length)
               return mat;
  
           int matcolumn=0,matrow=0,mat_column_size=mat[0].length;
           
           for (int row=0;row<r;row++)
           {
               for(int column=0;column<c;column++)
               {
                   res[row][column]=mat[matrow][matcolumn];
                   matcolumn++;
                   if(matcolumn==mat_column_size)
                   {
                       matcolumn=0;
                       matrow++;
                   }
               }
           }
           
        
           return res;
    }
}