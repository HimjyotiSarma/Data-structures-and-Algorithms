import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : => ");
        int Num = input.nextInt();
        int Temp = Num;
        int length = String.valueOf(Num).length();
        int Sum= 0;
        for(int i = length  ; i > 0 ; i--){
            int dgt = Temp % 10;
            Sum+=dgt;
            Temp/=10;
        }
        System.out.println("The Sum of Digits in "+Num+" is "+Sum);
    }
}
