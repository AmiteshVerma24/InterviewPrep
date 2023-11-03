package Recursion.Easy;

class FactorialOfANumber {
    public static void main(String[] args) {
        int ans = fib(5);
        System.out.println(ans);
    }
    public static int fib(int num){
        if(num < 2) return 1;
        return num * fib(num - 1);
    }
}
