import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AreaCircle {
    public static void main(String[] args) {
        /*Area Of Circle Java Program*/

        Scanner input =new Scanner(System.in);
        System.out.println("<<-- Area of the Circle -->>");
        System.out.print("Enter the Radius :  => ");
        float radius= input.nextFloat();
        double area= (3.14159265 * (Math.pow(radius, 2))) ;
        double truncatedArea= Math.floor(area * 100) / 100;
        System.out.println("The Area of the Circle is : "+ truncatedArea);
    }
}