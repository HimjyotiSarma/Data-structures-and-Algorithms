import java.util.Scanner;

public class MaxSubArray {
    public static void main(String[] args) {
        int MaxSubSum = MaxSubArrayCalc(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}, 0, 8);
        System.out.println(MaxSubSum);

    }
    private static int MaxSubArrayCalc(int[] num,int start, int end){
        if(start == end){
            return num[start];
        }

        int mid = (start + end) / 2;
        int left = MaxSubArrayCalc(num, start, mid);
        int right = MaxSubArrayCalc(num, mid+1, end );
        int combine = MaxCombineArray(num, start, end, mid);
        return Math.max(Math.max(left, right), combine);
    }
    private static int[] ArraySlice(int[] arr, int start, int end){
        int[] resultArr = new int[end - start];
        for(int i  = 0 ; i < resultArr.length; i++ ){
            resultArr[i] = arr[start + i];
        }
        return resultArr;
    }

    private static int MaxCombineArray(int[] arr, int start, int end, int mid){
        int sum =0;
        int leftSum = Integer.MIN_VALUE;
        for(int i =mid; i >= start; i-- ){
            sum = sum+arr[i];
            if(sum > leftSum){
                leftSum = sum;
            }
        }
        sum =0;
        int rightSum = Integer.MIN_VALUE;
        for(int i =mid+1; i <= end; i++ ){
            sum = sum+arr[i];
            if(sum > rightSum){
                rightSum = sum;
            }
        }
        return leftSum + rightSum;
    }
}
