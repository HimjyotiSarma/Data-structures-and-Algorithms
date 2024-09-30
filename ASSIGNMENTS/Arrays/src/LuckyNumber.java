import java.util.*;
public class LuckyNumber {

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int minInRow = matrix[i][0];
            int minInRowIndex = 0;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < minInRow) {
                    minInRow = matrix[i][j];
                    minInRowIndex = j;
                }
            }

            boolean isMaxInCol = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minInRowIndex] > minInRow) {
                    isMaxInCol = false;
                    break;
                }
            }

            if (isMaxInCol) {
                resultList.add(minInRow);
            }
        }

        return resultList;
    }
}

}
