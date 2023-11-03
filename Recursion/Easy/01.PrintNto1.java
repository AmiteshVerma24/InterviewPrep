package Recursion.Easy;

class PrintNto1 {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int num){
        if(num < 1) return;
        System.out.println(num);
        print(num - 1);
    }
}
