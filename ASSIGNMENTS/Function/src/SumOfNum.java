import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the Numbers to calculate the Sum : => ");
        List<Integer> allnums= new ArrayList<>();
        int num;
        do {
            num = in.nextInt();
            if(num!=0){
                allnums.add(num);
            }
            System.out.println("Type 0 to Exit from Programme");
        }while (num!=0);



        System.out.println("The Sum of "+concatNumbers(allnums)+ " is "+calculateSum(allnums));
    }
    static int calculateSum(List<Integer> allnums){
        int Sum = 0;
        for(int i : allnums){
            Sum+=i;
        }
        return Sum;
    }

    static String concatNumbers(List<Integer> allnums){
        StringBuilder sb = new StringBuilder();
        for(int i : allnums){
//           sb.append(i).append(", ");
            sb.append(", ").append(i);
        }
        // Remove the initial ", " (length of separator)
        return sb.substring(2);
    }
    
}
