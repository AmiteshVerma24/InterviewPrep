import java.util.*;

class OddOrEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check:- ");
        int num = sc.nextInt();
        System.out.println((num & 1) == 1);
        sc.close();
    }
}