package Recursion.Medium;
// https://www.hackerrank.com/challenges/the-power-sum/problem?isFullScreen=true
class ThePowerSum {
    public static void main(String[] args) {
        int x = 100;
        int n = 2;
        System.out.println(calculate_combinations(1, 0, x, n));
    }
     public static int calculate_combinations(int current, int sum, int x, int n){
        int local_sum = sum + (int)Math.pow(current, n);
        if(local_sum > x){
            return 0;
        }
        if(local_sum == x) return 1;
        // We take current
        int left = calculate_combinations(current + 1, local_sum, x, n);
        // We don't take current
        int right = calculate_combinations(current + 1, sum, x, n);
        return left + right;
    }
}
