import java.util.Scanner;

public class LeapYear {
    // Check Leap Year Or Not
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int Year= in.nextInt();
        if(Year %4 ==0){
            if(Year % 100 ==0){
                if(Year % 400 == 0){
                    System.out.println("The Year "+Year+" is a Leap Year.");
                    return;
                }else {
                    System.out.println("The Year "+Year+" is NOT a Leap Year.");
                    return;
                }
            }
            System.out.println("The Year "+Year+" is a Leap Year.");
        }else System.out.println("The Year "+Year+" is NOT a Leap Year.");

    }
}
