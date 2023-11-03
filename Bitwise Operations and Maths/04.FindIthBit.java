import java.util.Scanner;

class FindIthBitpublic  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num = sc.nextInt();
        System.out.print("Enter the position:- ");
        int i = sc.nextInt();
        System.out.println(1 << (i - 1));
        int ans = num & (1 << (i - 1));
        System.out.println(ans);
        sc.close();
    }
}
