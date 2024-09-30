import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {

        Scanner num1= new Scanner(System.in);
        Scanner num2= new Scanner(System.in);
        System.out.print("Enter first num : ");
        int firstNum= num1.nextInt();
        System.out.print("Enter Second num : ");
        int secondNum= num1.nextInt();

        long sum= firstNum+secondNum;
        System.out.println("Sum of two number is : "+ sum);

    }
}