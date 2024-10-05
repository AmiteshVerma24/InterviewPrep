package Recursion.Medium;

class PerfectSquare {
    public static void main(String[] args) {
        int num = 1678;
        System.out.println(find_least(num));
    }
    public static int find_least(int num) {
        if (num < 4) {
            return num;
        }
        int current_least = num;
        int n = 2, sq, quotient, remainder;
        while(n*n <= num) {
            sq = (int) Math.pow(n, 2);
            quotient = num / sq;
            remainder = num % sq;
            current_least = Math.min(current_least, quotient + find_least(remainder));
            n = n + 1;
        }
        return current_least;
    }
}
