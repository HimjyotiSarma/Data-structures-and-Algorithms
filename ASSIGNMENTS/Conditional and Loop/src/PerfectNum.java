import java.util.Scanner;

public class PerfectNum {
    //  Perfect Number In Java
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number : => ");
        int num= sc.nextInt();
        int SumOfDivisor= 1;
        for(int i=2; i< num; i++) {
            if (num % i == 0) {
                SumOfDivisor += i;
            }
        }

        if(SumOfDivisor == num){
            System.out.println("The number "+num+" is a Perfect Number.");
        }else {
            System.out.println("The number "+num+" is NOT a Perfect Number.");
        }
    }
}
