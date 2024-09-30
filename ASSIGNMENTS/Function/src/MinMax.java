import java.util.Scanner;

public class MinMax {
//    Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Numbers : => ");
        int num1 = sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        System.out.println("Enter 1 for Maximum and 2 for Minimum : ");
        int operation = sc.nextInt();
        switch (operation){
            case 1: int max= Maximum(num1, num2, num3);
                System.out.println("The maximum among "+num1+", "+num2+" and "+num3+" is "+max);
                break;
            case 2: int min=Minimum(num1,num2,num3);
                System.out.println("The minimum among "+num1+", "+num2+" and "+num3+" is "+min);
                break;
            default:
                System.out.println("Enter a Valid Input");
        }
    }
    static int Maximum(int num1, int num2, int num3){
        return Math.max((Math.max(num1,num2)),num3);
    }
    static int Minimum(int num1, int num2, int num3){
        return Math.min((Math.min(num1,num2)),num3);
    }
}
