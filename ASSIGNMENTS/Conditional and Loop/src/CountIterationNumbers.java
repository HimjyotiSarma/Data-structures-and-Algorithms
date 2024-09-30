import java.util.Scanner;

public class CountIterationNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Numbers : => ");
        int num= sc.nextInt();
        int NegSum= 0;
        int evenSum= 0;
        int oddSum=0;

        while (num!=0){

            if(num < 0 ){
               NegSum+=num;
           } else if (num % 2 ==0 && num > 0) {
               evenSum+=num;
           } else{
                oddSum+=num;
          }
            num= sc.nextInt();
        }
        System.out.println("The Sum of Negative Numbers are : "+NegSum);
        System.out.println("The Sum of Even Numbers are : "+evenSum);
        System.out.println("The Sum of Odd Numbers are : "+oddSum);
    }
}
