import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number here : ");
        int num  = sc.nextInt();
        System.out.println("The Factorial of "+num+" is "+Factorial(num));
    }
    private static int Factorial(int num){
        int factor = 1;
        if(num== 0 ){
            return 1;
        }
        for(int i = num ; i > 0 ; i--){
            factor*=i;
        }
        return factor;
    }
}
