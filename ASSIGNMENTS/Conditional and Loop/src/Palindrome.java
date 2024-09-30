import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = in.nextInt();
        int tempNum = num;
        int reversed = 0;
        int length = String.valueOf(num).length();
        while(tempNum > 0 ){
            int remainder = tempNum % 10 ;
            reversed = reversed * 10 + remainder;
            tempNum/=10;
        }
        System.out.println("The Reversed Number is "+ reversed);
        if( reversed == num){
            System.out.println("The Number "+num+" is a Palindrome Number.");
        }else{
            System.out.println("The Number "+num+" is NOT a Palindrome Number.");
        }
    }
}
