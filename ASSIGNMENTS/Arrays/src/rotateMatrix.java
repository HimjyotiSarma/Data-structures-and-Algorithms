public class rotateMatrix {
    class Solution {
        public boolean findRotation(int[][] mat, int[][] target) {
            int rotateCount = 0;
            while(rotateCount < 4){
                int[][] tempArr = new int[mat[0].length][mat.length];
                for(int i = 0; i < mat[0].length; i++ ){
                    for(int j = 0; j < mat.length ; j++){
                        tempArr[i][j] = mat[j][mat.length - 1 - i ];
                    }
                }
                if(CompareArray(tempArr, target) == true){
                    return true;

                }
                mat = tempArr;
                rotateCount++;
            }
            return false;
        }
        private static boolean CompareArray(int[][] first, int[][] second){
            for(int i = 0; i < first.length ; i++ ){
                for(int j = 0; j < first[i].length; j++){
                    if(first[i][j] != second[i][j]){
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
