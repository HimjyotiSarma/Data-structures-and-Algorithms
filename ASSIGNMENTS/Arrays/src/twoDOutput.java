public class twoDOutput {
    public static void main(String[] args) {
        int[][] newTwoD = new int[3][2];
        System.out.println(newTwoD);
        for(int i =0; i< newTwoD.length; i++){
            for(int j =0 ; j< newTwoD[i].length ; j++){
                System.out.println(newTwoD[i][j]);
            }
        }
    }
}
