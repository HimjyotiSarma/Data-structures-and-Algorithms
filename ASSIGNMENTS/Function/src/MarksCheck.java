import java.util.Scanner;

public class MarksCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Marks to Check your Grade: ");
        float marks  = sc.nextFloat();
        if(marks< 0 || marks > 100){
            System.out.println("Invalid Marks Input");
        }
        else{
            System.out.println("The Grade of the Student of marks "+marks+" is "+Grade(marks));
        }
    }
    private static String Grade(float mark){
        if (mark > 90 && mark <= 100) {
            return "AA";
        } else if (mark > 80 && mark <= 90) {
            return "AB";
        } else if (mark > 70 && mark <= 80) {
            return "BB";
        } else if (mark > 60 && mark <= 70) {
            return "BC";
        } else if (mark > 50 && mark <= 60) {
            return "CD";
        } else if (mark > 40 && mark <= 50) {
            return "DD";
        } else {
            return "Fail"; // Default grade
        }
    }
}
