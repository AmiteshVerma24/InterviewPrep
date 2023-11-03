package Recursion.Easy;

class ReverseANumber {
    static int sum = 0;
    public static void reverse1(int num) {
        if(num == 0) return;
        sum = sum * 10 + (num % 10);
        reverse1(num/10);
    }

    public static int reverse2(int num){
        int digits = (int)(Math.log10(num)) + 1;
        if(num % 10 == num) return num;
        return (num % 10) * (int) Math.pow(10, digits - 1) + reverse2(num / 10);
    }

    public static void main(String[] args) {
        System.out.println(reverse2(1234));
    }
    
}
