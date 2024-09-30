public class Spiral_II {
    class Solution {
        public int[][] generateMatrix(int n) {
            int left = 0;
            int right = n;
            int top = 0;
            int bottom = n;
            int maxNum = n * n;
            int currentNum = 1;
            int[][] result = new int[n][n];
            while(currentNum <= maxNum){
                for(int i = left; i < right ; i++){
                    result[top][i] = currentNum;
                    currentNum++;
                }
                top++;
                for(int i = top; i < bottom; i++ ){
                    result[i][right - 1 ] = currentNum;
                    currentNum++;
                }
                right--;
                if(!(top < bottom && left < right)){
                    break;
                }
                for(int i = right - 1; i >= left; i--){
                    result[bottom - 1][i] = currentNum;
                    currentNum++;
                }
                bottom--;
                for(int i= bottom - 1; i >= top; i-- ){
                    result[i][left] = currentNum;
                    currentNum++;
                }
                left++;
            }
            return result;
        }
    }
}
