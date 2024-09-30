import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter a Number to check if its Prime Or Not : ");
        int number = input.nextInt();
        if(PrimeOrNot(number)){
            System.out.println("The Number "+ number +" is a Prime number");
        }else{
            System.out.println("The Number "+number+" is NOT a Prime number");
        }
    }
    private static boolean PrimeOrNot(int num){
        if(num < 2){
            return false;
        }
        for(int i= 2; i<= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
