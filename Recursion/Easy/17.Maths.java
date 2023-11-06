package Recursion.Easy;

/*
    Write a recursive function for given n and a to determine x:
    n = a ^ x 
    a = 2, 3, 4
    (2 ^ -31) <= n <= (2 ^ 31) - 1      
 */
class Maths {
    public static void main(String[] args) {
        // System.out.println(solution1(2,512,0, 1));
        System.out.println(solution2(2,52,0));
    }
    // By not using Math.pow method
    public static int solution1(int a , int n , int x , int num){
        if(n == num) return x;
        if(n < num) return
        num = a * num;
        x++;
        return solution1(a, n, x, num);
    }
    // By using Math.pow
    public static int solution2(int a , int n , int x){
        if(n == Math.pow(a , x)) return x;
        if(n < Math.pow(a, x)) return -1;
        return solution2(a, n, x+1);
    }
}
