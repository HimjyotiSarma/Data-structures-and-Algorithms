import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        /*Write a program to print whether a number is even or odd, also take input from the user.*/
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a Number :  ");
        long num= input.nextLong();
        if(num %2 == 0){
            System.out.println("The number is Even");
        }else {
            System.out.println("The number is Odd");
        }
    }
}
