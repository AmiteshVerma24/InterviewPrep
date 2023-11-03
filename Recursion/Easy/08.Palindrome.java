package Recursion.Easy;

class Palindrome {

    public static int reverse_number(int num){
        int digits = (int)(Math.log10(num)) + 1;
        if(num % 10 == num) return num;
        return (num % 10) * (int) Math.pow(10, digits - 1) + reverse_number(num / 10);
    }

    public static boolean is_palindrome(int num){
        return reverse_number(num) == num ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(is_palindrome(1234321));
    }
    
}
