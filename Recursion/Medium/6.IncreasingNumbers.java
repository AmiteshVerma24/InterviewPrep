package Recursion.Medium;
// https://practice.geeksforgeeks.org/problems/n-digit-numbers-with-digits-in-increasing-order5903/1

class IncreasingNumbers {
    public static void main(String[] args) {
        bruteForce(2);
    }
    public static void bruteForce(int num){
        // Check the validity
        if(num < 1 || num > 9) {
            return;
        }
        // Main code
        int start = (int) Math.pow(10, num - 1);
        int end = (int) Math.pow(10, num);
        while(start <= end) {
            // Check if the digits of the number is in increasing order
            if(checkIncreasing(start)){
                System.out.print(start + " ");
            }
            start++;
        }

    }
    public static boolean checkIncreasing(int num) {
        int poppedDigit, lastDigit;
        while(num > 0) {
            poppedDigit = num % 10;
            num = num / 10;
            lastDigit = num % 10;
            if((poppedDigit > lastDigit) == false) {
                return false;
            }
        }
        return true;
    }
    public static void recursiveSolution(int num){
        int start = (int) Math.pow(10, num - 1);
        int end = (int) Math.pow(10, num);
    }
}
