import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {

        /*To find Armstrong Number between two given number*/

        Scanner input= new Scanner(System.in);
        System.out.print("Enter your Number to check if its Armstrong : =>> ");
        int originalNum= input.nextInt();
        int tempNumber= originalNum;
        // Convert number to String and then find its length.
        int length= String.valueOf(tempNumber).length();
        int total = 0;

        for(int i=1; i<=length;i++){
            int temp= tempNumber % 10;
            total += (int) Math.pow(temp, length);
            tempNumber /= 10;
        }
        if(total==originalNum){
            System.out.println("The number is a ARMSTRONG number.");
        }else {
            System.out.println("The number is NOT a Armstrong number.");
        }

    }
}
