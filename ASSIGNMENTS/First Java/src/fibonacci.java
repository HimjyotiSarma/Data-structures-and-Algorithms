import java.util.Scanner;

public class fibonacci {
    /*To calculate Fibonacci Series up to n numbers*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first= 0;
        int second= 1;
        int third= 1;
        System.out.print("Enter the Fibonacci Max value : ->> ");
        int max= input.nextInt();

        for(int i = 0; i<=max; i++){
            if(i<=1){
                System.out.println(i);
            }else {
                third=first+second;
                first = second;
                second = third;

                System.out.println(third);
            }
        }
    }
}
