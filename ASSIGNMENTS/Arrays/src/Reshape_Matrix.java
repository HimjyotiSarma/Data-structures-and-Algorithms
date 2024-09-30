public class Reshape_Matrix {
    class Solution {
        public int[][] matrixReshape(int[][] mat, int r, int c) {
            int originalRowSize = mat.length;
            int originalColSize = mat[0].length;

            int totalSize = originalRowSize * originalColSize;
            if(totalSize != r * c){
                return mat;
            }
            int[][] newMat = new int[r][c];
            for(int i =0 ; i < totalSize ; i++){
                newMat[i / c][i % c] = mat[i / originalColSize][i % originalColSize];
            }
            return newMat;
        }
    }
}
