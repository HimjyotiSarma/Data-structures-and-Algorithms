import java.util.*;

public class greetings {
    public static void main(String[] args) {
        /*Take name as input and print a greeting message for that particular name.*/
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name= input.next();
        System.out.println("Welcome "+name+", Nice to see you here!!");
    }
}
