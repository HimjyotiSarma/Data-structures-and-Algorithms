import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String to Check if its Palindrome or not : => ");
        String str= input.next();
        str= str.toLowerCase();
        int length= str.length();
        boolean isPalindrome= true;
        for(int i = 0 ; i < length/2; i++ ){
            if(str.charAt(i) != str.charAt(length-1-i)){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("The string "+str+" is a Palindrome.");
        }
        else {
            System.out.println("The string "+str+" is NOT a Palindrome.");
        }

    }
}
