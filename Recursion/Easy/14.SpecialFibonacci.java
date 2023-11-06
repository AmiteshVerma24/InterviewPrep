package Recursion.Easy;
// https://www.codechef.com/problems/FIBXOR01/
/*
 Sankalp recently learned Fibonacci numbers and now he is studying different algorithms to find them. After getting bored of reading them, he came with his own new type of numbers. He defined them as follows:

 f(0) = a;
 f(1) = b;
 f(n) = f(n-1) ^ f(n-2);  when n>1, where ^ denotes the bitwise xor operation.
 You are given three integers a,b and n , calculate f(n).
 */
class SpecialFibonacci {
    public static void main(String[] args) {
        int a = 92, b = 49, n = 21;
        System.out.println(specialFibonacci(a, b, n));

    }
    public static int specialFibonacci(int a, int b , int n){
        if(n == 0) return a;
        if(n == 1) return b;
        return specialFibonacci(a, b, n - 1) ^ specialFibonacci(a, b, n - 2);
    }
}
