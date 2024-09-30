import java.util.Scanner;

public class SumTillZero {
    public static void main(String[] args) {

        /*Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)*/

        Scanner in= new Scanner(System.in);
        System.out.println("Enter a Non Zero number and 0 to exit : => ");
        int total = 0;
        int num = in.nextInt();
        while( num != 0){
            total+=num;
            num= in.nextInt();
        }
        System.out.println("The Sum of all the numbers are : => "+ total);
    }
}
