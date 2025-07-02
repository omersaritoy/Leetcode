public class Solution {
    public int[][] MatrixReshape(int[][] mat, int r, int c) {
        int[][] result=new int[r][];
        int n=mat.Length;
        int m=mat[0].Length;

        if(n*m!=r*c)
            return mat;

        int index=0;

        for(int i=0;i<r;i++){
            result[i]=new int[c];
            for(int j=0;j<c;j++){
                int oldRow=index/m;
                int oldCol=index%m;
                result[i][j]=mat[oldRow][oldCol];
                index++;
            }
        }
        return result;
    }
}