package Recursion.Medium;   
// https://leetcode.com/problems/powx-n/description/


class PowXN {
    public static void main(String[] args) {
        double x = 2;
        int n = -2147483648; // If we do this * -1 it will exceed the memory limit

        System.out.println(pow(x, n));
    }

    public static double pow(double x, int n) {
        if (x == 1) return 1;
        if (x == 0) return 0;
        if (n == 0) return 1;

        // Handle the case of minimum integer value
        if (n == Integer.MIN_VALUE) {
            x = 1 / x;
            return x * pow(x, -(n + 1)); // Use -(n + 1) to avoid overflow when converting -2147483648 to its positive counterpart
        }

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        if (n % 2 == 0) {
            double ans = pow(x, n / 2);
            return ans * ans;
        } else {
            double ans = pow(x, (n - 1) / 2);
            return x * ans * ans;
        }
    }
}
