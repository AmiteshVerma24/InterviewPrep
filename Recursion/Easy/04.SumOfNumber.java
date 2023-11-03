package Recursion.Easy;

class SumOfNumber {
    public static void main(String[] args) {
        int ans = sum(5);
        System.out.println(ans);
    }
    public static int sum(int num){
        if(num < 1) return 0;
        return num + sum(num - 1);
    }
}
