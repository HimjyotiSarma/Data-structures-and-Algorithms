import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaCircum {
    static float pie = 3.14159265359F;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius to calculate the Area and Circumference");
        float radius = input.nextFloat();
        DecimalFormat resultFormt = new DecimalFormat("#.###");
        float circum = Float.parseFloat(resultFormt.format(circumference(radius)));
        float areaCircle = Float.parseFloat(resultFormt.format(area(radius)));
        System.out.println("The Area of Circle is : "+areaCircle+" and Circumference is "+circum);

    }
    private static double circumference(float radius){
        double circum = 2 * pie * radius;
        return circum;
    }

    private static double area(float radius){
        double area = pie * (Math.pow(radius, 2));
        return area;
    }
}
