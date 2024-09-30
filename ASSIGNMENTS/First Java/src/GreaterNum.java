import java.util.Scanner;

public class GreaterNum {
    public static void main(String[] args) {
       //
        /*Take 2 numbers as input and print the largest number*/
        //
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        float num1= input.nextFloat();
        System.out.print("Enter the Second Number : ");
        float num2=input.nextFloat();
//        int num2= (int)(input.nextFloat());


        // Logic for Greater Number

        if(num1>num2){
//            System.out.println((int)(num1)+" is greater than "+(int)(num2));
            System.out.println(num1+" is greater than "+num2+" by "+(num1-num2));
        }else {
            System.out.println(num2+" is greater than "+num1+" by "+(num2-num1));
        }
    }
}
