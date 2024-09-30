import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Principal : => ");
        int principal = in.nextInt();
        System.out.print("Enter the Rate of Interest : => ");
        float rate = in.nextFloat() / 100 ;
        System.out.print("Enter the time ( in Years ) : => ");
        int time =in.nextInt();
        System.out.print("Enter the number of times interest is compounded per year: => ");
        int numberOfTime = in.nextInt();
        double amount = principal * Math.pow(1+(rate/numberOfTime), numberOfTime*time);
        double compound= amount - principal;
        amount=Math.round(amount* 100.0)/100.0;
        compound= Math.round(compound * 100.0) / 100.0;
        System.out.println("Press 1 for calculating amount and 2 for Interest ");
        int num = in.nextInt();

        switch (num){
            case 1: {
                System.out.println("The Total Compounded amount along with Interest is, "+amount);
                break;
            }
            case 2 : {
                System.out.println("The Compound Interest of "+principal+" with rate "+rate+" and time "+time+" is "+compound);
            }
        }
    }
}
