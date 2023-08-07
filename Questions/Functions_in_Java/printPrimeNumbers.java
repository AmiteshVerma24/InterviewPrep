package Questions.Functions_in_Java;
import java.util.Scanner;

public class printPrimeNumbers {
    public static boolean checkPrime(int num){
        if(num <= 1){
            return false;
        }
        int flag = 0;
        for(int i = 2 ; i < num ; i++){
            if(num % i == 0){
                flag++;
            }
        }
        return (flag==0);
    }
    public static void printPrime(int lower_limit, int upper_limit){
        for(int i = lower_limit ; i <= upper_limit ; i++){
            if(checkPrime(i) == true){
                System.out.print(i + ", ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int num1 = in.nextInt();
        System.out.print("Enter the upper limit: ");
        int num2 = in.nextInt();
        System.out.format("The prime numbers between %d and %d are:-\n",num1,num2);
        printPrime(num1, num2);
        in.close();
    }
}
