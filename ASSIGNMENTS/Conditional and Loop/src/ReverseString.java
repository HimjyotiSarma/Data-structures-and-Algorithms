import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str= sc.next();
        int length= str.length();
        StringBuilder newStr= new StringBuilder();
        for(int i=length-1; i >= 0; i--){
            char c= str.charAt(i);
            newStr.append(c);
        }
        System.out.println(newStr);
    }
}
