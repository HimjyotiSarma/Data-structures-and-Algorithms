import java.util.Scanner;

public class factorsOfNum {
    public static void main(String[] args) {
        /*Input a number and print all the factors of that number (use loops).*/
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : => ");
        int num = input.nextInt();
        int temp_num= num / 2;

        while(temp_num > 1 ){
            if(num % temp_num== 0){
                System.out.print(temp_num+", ");
            }
            temp_num--;
        }
    }
}
