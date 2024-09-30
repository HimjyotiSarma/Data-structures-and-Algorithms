//package AddArrayNum;
//
//public class js {
//
//}
// Previous solution, but It can be wrong in certain condition
//class Solution {
//    public List<Integer> addToArrayForm(int[] num, int k) {
//        int tempArrNum = arrToInt(num);
//        int newNumber = tempArrNum+k;
//        List<Integer> OutputArr = intToArrayList(newNumber);
//        return OutputArr;
//    }
//    private static int arrToInt(int[] arr){
//        int output = 0;
//        for (int digit : arr) {
//            output = output * 10 + digit;
//        }
//        return output;
//    }
//    private static List<Integer> intToArrayList(int num) {
//        List<Integer> output = new ArrayList<>();
//        while (num > 0) {
//            int lastDigit = num % 10; // Get the last digit
//            output.add(lastDigit);
//            num /= 10; // Remove the last digit
//        }
//        Collections.reverse(output); // Reverse the list to maintain order
//        return output;
//    }
//}
import java.util.*;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int n = num.length;
        int carry = 0;
        int i = n - 1;

        while (i >= 0 || k > 0 || carry > 0) {
            int digit = (i >= 0 ? num[i] : 0) + (k % 10) + carry;
            carry = digit / 10;
            result.add(digit % 10);
            k /= 10;
            i--;
        }

        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int k = 1;
        System.out.println(sol.addToArrayForm(num, k));  // Output should be [1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    }
}

