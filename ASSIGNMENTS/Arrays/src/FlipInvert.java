public class FlipInvert {
    public static void main(String[] args) {
        class Solution {
            public int[][] flipAndInvertImage(int[][] image) {
                for (int[] rows : image) {
                    //reverse the array
                    for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                        //swap
                        int temp = rows[i] ^1;
                        rows[i] = rows[image[0].length-i-1]^1;
                        rows[image[0].length-i-1] = temp;
                    }
                }
                return image;

            }
        };

//      // My Solution

        class MySolution {
            public int[][] flipAndInvertImage(int[][] image) {
                int[][] Output= new int[image.length][];
                for(int i= 0 ; i < image.length; i++){
                    int[] result = new int[image[i].length];
                    for(int j = 0; j < image[i].length ; j++){
                        int lengthArr = image[i].length;
                        int tempFlip = image[i][lengthArr-1-j];
                        if(tempFlip == 0){
                            tempFlip = 1;
                        }else{
                            tempFlip = 0;
                        }
                        result[j] = tempFlip;
                    };
                    Output[i]= result;
                }
                return Output;
            }
        }
    }
}
