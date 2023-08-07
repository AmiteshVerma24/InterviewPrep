package Questions.Functions_in_Java;
import java.util.Scanner;

public class checkPalindrome {
    public static boolean checkPalin(int num){
        int multiplier = 10, remainder = 0 , rev = 0, original = num;
        while(num > 0){
            remainder = num % 10;
            rev = rev * multiplier + remainder;
            num = num / 10;
        }
        return (original == rev);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to be checked:- ");
        int num = in.nextInt();
        if(checkPalin(num)){
            System.out.println("The number is palindrome.");
        }else{
            System.out.println("The number is not palindrome.");
        }
        in.close();
    }
}
