public class Solution {
public bool SearchMatrix(int[][] matrix, int target) {
        int sizeRow=matrix.Length;
        int sizeCol=matrix[0].Length;
        
        int row=0;
        int col=sizeCol-1;
        if(matrix==null)
            return false;
        
       while(row<sizeRow&&col>-1){
           int temp=matrix[row][col];
           if(temp==target)
            return true ;
            if(target>temp)
                row++;
            else 
             col--;    
       }  
        
        return false;
    
    }
}