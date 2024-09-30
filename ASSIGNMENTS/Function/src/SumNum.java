import java.util.Scanner;

public class SumNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First Number : => ");
        int num1 = in.nextInt();
        System.out.println("Enter the Second Number : => ");
        int num2= in.nextInt();
        System.out.println("The Sum of "+num1+" and "+num2+" is "+(num1+num2));
    }
}
