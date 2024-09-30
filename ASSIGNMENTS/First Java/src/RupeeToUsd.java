import java.util.Scanner;

public class RupeeToUsd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Amount in Rupee(₹) : ");
        float rupee = input.nextFloat();
        double usd= 0.0120266462374036* rupee;
        System.out.println("The amount is USD is "+((float)(usd)));
    }
}
