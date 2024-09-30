import java.util.Scanner;

public class HCF_Calculate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int num1 = in.nextInt();
        System.out.print("Enter the Second Number : ");
        int num2= in.nextInt();
        int greatest=1;
        int lowest =1;
        if(num1 >= num2){
            greatest =num1;
            lowest = num2;
        }else{
            greatest = num2;
            lowest =num1;
        }
        int divisor = lowest;
        int dividend = greatest;
        int remainder = dividend % divisor;
        while (remainder != 0) {
            dividend = divisor;
            divisor = remainder;
            remainder = dividend % divisor;

        }
        System.out.println("The HCF of " + num1 + " and " + num2 + " is " + divisor);

    }
}
