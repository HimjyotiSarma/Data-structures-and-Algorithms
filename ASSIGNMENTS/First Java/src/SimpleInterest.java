import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        /*Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.*/
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principle amount in ₹ : ");
        int principal= input.nextInt();
        System.out.print("Enter the Rate of Interest : ");
        float rate= input.nextFloat();
        System.out.print("Enter the Time Period in years: ");
        float time= input.nextFloat();
        double interest = (principal * rate * time)/100;
        System.out.println("The Simple interest of Principal "+principal+", with Time period, "+time+" and Rate of interest, "+rate+" will be : ->>> "+ interest);
        System.out.println("The Total amount Earned will be : ==> "+(principal+interest));
    }
}
