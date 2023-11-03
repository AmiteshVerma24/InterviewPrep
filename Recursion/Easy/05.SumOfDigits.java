package Recursion.Easy;

class SumOfDigits {
    public static void main(String[] args) {
        int ans = sum(1342);
        System.out.println(ans);
    }
    public static int sum(int num){
        if(num <= 0) return 0;
        return (num % 10) + sum(num / 10);
    }

}
