package Recursion.Easy;

class GeekonacciNumber {
    public static void main(String[] args) {
        // System.out.println(geekonacciNumberRecursive(1, 3, 2, 6));
        System.out.println(geekonacciNumber(1, 3, 2, 10));
    }
    public static int geekonacciNumberRecursive(int f, int s, int t, int n){
        if(n == 1) return f;
        if(n == 2) return s;
        if(n == 3) return t;
        return geekonacciNumberRecursive(f, s, t, n - 1) + geekonacciNumberRecursive(f, s, t, n - 2) + geekonacciNumberRecursive(f, s, t, n - 3);
    }
    public static int geekonacciNumber(int f, int s, int t, int n){
        int counter = n;
        while(counter > 3){
            int sum = f + s + t;
            f = s;
            s = t;
            t = sum;
            counter--;
        }
        return t;
    }
}
