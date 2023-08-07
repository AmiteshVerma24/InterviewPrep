package Questions.Functions_in_Java;
import java.util.Scanner;

public class pythagorean_triplet {
    public static boolean checkPythogoreanTriplet(int a, int b, int c){
        if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2) || Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2) || Math.pow(c,2) + Math.pow(a,2) == Math.pow(b,2)){
            return true;
        }
        System.out.println(Math.pow(b,2));
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = in.nextInt();
        if(checkPythogoreanTriplet(num1, num2, num3) == true){
            System.out.println("The numbers are pythogorean triplet.");
        }else{
            System.out.println("The numbers are not pythogorean triplet.");
        }
        in.close();
    }
}
