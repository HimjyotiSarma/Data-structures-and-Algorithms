import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the Minimum Value : ");
        int min = input.nextInt();
        System.out.print("Enter the Maximum Value : ");
        int max = input.nextInt();
        ArrayList<Integer> allPrimes = PrimeArray(min, max);
        String PrimeString = ArrayToStr(allPrimes);
        System.out.println("The Prime Numbers between "+min+" and "+max+" is "+PrimeString);
    }
    private static String ArrayToStr(List<Integer> primes){
        StringBuilder sb = new StringBuilder();
        for(int num : primes){
          sb.append(", ").append(num);
        }
        return sb.substring(2);
    }
    private static ArrayList<Integer> PrimeArray(int min, int max){
        ArrayList<Integer> allPrimes = new ArrayList<Integer>();
        for(int i = min; i<= max; i++){
            if(isPrime(i)) {
                allPrimes.add(i);
            }
        }
        return allPrimes;
    }

    private static Boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2 ; i*i<=num; i++){
            if(num % i==0){
                return false;
            }
        }
        return true;
    }
}
