import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Alphabet to check if its Consonant or Vowel : ");
        char ch= in.next().charAt(0);
        ch = Character.toLowerCase(ch);

        if(ch == 'a' || ch=='e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch+" is a Vowel");
        }else{
            System.out.println(ch+" is NOT a vowel");
        }
    }
}
