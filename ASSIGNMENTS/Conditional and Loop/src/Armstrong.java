import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number to check if if Armstrong or Not :  => ");
        int num = in.nextInt();
        int length= String.valueOf(num).length();
        double total =0;
        int temp =num;
        while(temp > 0){
            int last= temp % 10;
            double pow = Math.pow(last, length);
            total+=pow;
            temp/=10;
        }
        if(total == num){
            System.out.println("The number "+num+" is a Armstrong Number.");
        } else {
            System.out.println("The number "+num+" is NOT a Armstrong Number.");
        }

    }
}
