package Recursion.Easy;

class Print1toN {
    public static void main(String[] args) {
        // print1(5, 1);
        print2(5);
    }
    public static void print1(int limit , int num){
        if(num > limit) return;
        System.out.println(num);
        print1(limit, num+1);
    }
    public static void print2(int num){
        if(num < 1) return;
        print2(num - 1);
        System.out.println(num);
    }
}
