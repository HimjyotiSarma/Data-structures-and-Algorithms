import java.util.Scanner;

public class Plaindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number to check if its Palindrome :");
        int num = sc.nextInt();
        if(isPlaindrome(num)){
            System.out.println("The Number "+num+" is a PALINDROME.");
        }else{
            System.out.println("The Number "+num+" is NOT a Palindrome");
        }
    }
    private static boolean isPlaindrome(int num){
        int length = String.valueOf(num).length();
        for(int i = 0; i < length/2; i++){
            int first = Integer.parseInt(Character.toString(Integer.toString(num).charAt(i)));
            int last = Integer.parseInt(Character.toString(Integer.toString(num).charAt(length-1-i)));
            if(first != last){
                return false;
            }
        }
        return true;
    }
}
