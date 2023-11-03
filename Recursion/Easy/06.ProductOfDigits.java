package Recursion.Easy;

class ProductOfDigits {
    public static void main(String[] args) {
        int ans = product(1342);
        System.out.println(ans);
    }
    public static int product(int num){
        if(num % 10 == num) return num;
        return (num % 10) * product(num / 10);
    }
}
