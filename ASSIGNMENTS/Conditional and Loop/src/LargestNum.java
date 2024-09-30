import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        /*Take integer inputs till the user enters 0 and print the largest number from all.*/
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a Non-Zero Number and 0 to quit :=> ");
        int num = in.nextInt();
        int largest = 0;

        while(num != 0){
            if(num > largest){
                largest = num;
            }
            num= in.nextInt();
        }
        System.out.println("The Largest Number of all is : => "+largest);
    }
}
