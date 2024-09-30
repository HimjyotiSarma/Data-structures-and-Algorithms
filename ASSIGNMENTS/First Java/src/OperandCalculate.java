import java.util.Scanner;

public class OperandCalculate {
    public static void main(String[] args) {
        /*Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)*/
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        float num1= input.nextInt();
        System.out.print("Enter the Second Number : ");
        float num2= input.nextInt();
        System.out.print("Enter the Operator (+, -, *, /) for calculation : ");
        String operator = input.next();


        // Logic of Calculation

        switch (operator) {
            case "+" -> System.out.println("The Sum of numbers are : " + (num1 + num2));
            case "-" -> System.out.println("The Difference of numbers are : " + (num1 - num2));
            case "/" -> System.out.println("The Division of " + num1 + " with " + num2 + " is " + (num1 / num2));
            case "*" -> System.out.println("The Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
        }
    }
}
