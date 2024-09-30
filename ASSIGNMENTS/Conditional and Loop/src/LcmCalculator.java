import java.util.Scanner;

public class LcmCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int num1= in.nextInt();
        System.out.print("Enter the Second Number : ");
        int num2= in.nextInt();
        int max= Math.max(num1, num2);
        for(int i=max; i<=num1*num2; i=i+max){
            if(i % num1 == 0 && i % num2 ==0){
                System.out.println("The LCM of "+num1+" and "+num2+" is "+ i);
                break;
            }
        }

    }
}
