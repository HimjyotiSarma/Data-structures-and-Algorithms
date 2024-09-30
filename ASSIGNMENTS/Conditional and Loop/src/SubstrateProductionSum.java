import java.util.Scanner;

public class SubstrateProductionSum {
    public static void main(String[] args) {
        /*Given an integer number n, return the difference between the product of its digits and the sum of its digits.*/
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the Number : => ");
        int num = in.nextInt();
        int tempNum= num;
        int product = 1;
        int sum= 0;
//        int length= String.valueOf(num).length();

        while( tempNum > 0 ){
            int temp = tempNum % 10;
            product*=temp;
            sum+=temp;
            tempNum /= 10;
        }

        int diff= product - sum;

        System.out.println("The difference between the product of "+num+" digits and the sum of "+num+" digits is "+diff);
    }
}
