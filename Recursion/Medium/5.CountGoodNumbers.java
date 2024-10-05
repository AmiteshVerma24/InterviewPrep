package Recursion.Medium;

class CountGoodNumbers {
    public static void main(String[] args) {
        System.out.println(countGoodNumbers(30));
    }
     public static int countGoodNumbers(long n) {
        long prime = n / 2;
        long even = n - prime;
        long modx = (long) (Math.pow(10, 9) + 7);
        
        long count = (modPow(5, even, modx) * modPow(4, prime, modx)) % modx;
        System.out.println(count);
        return (int) count;
    }
    
    public static long modPow(long base, long exponent, long mod) {
        long result = 1;
        base = base % mod;

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent /= 2;
        }
        
        return result;
    }
}
