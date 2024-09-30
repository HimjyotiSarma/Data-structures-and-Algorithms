import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number : => ");
        int num = in.nextInt();
        int factor=1;

        for(int i= num ; i > 1 ; i--){
            factor*=i;
        }
        System.out.println("The factorial of "+num+" is "+factor);
    }
}
