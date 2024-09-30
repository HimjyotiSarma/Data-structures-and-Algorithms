import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the Main Number : ");
        long num= in.nextLong();
        System.out.print("Enter the Number that you want to find the occurrence of : ");
        int oc= in.nextInt();
//        int length= String.valueOf(num).length();
        int totalOcc= 0;

        while(num>0){
            long last= num % 10;
            if(last==oc){
                totalOcc++;
            }
            num=num / 10;
        }
        System.out.println("The Total Occurrence of "+oc+" is "+ totalOcc);

    }
}