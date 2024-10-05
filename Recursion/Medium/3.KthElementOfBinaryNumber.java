package Recursion.Medium;
// https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/

class KthElementOfBinaryNumber {
    public static void main(String[] args) {
        findBinaryNumber(1, 4, "", 11);
    }
    public static void findBinaryNumber(int current, int n, String str, int k){
        // Base condition
        if(current > n) {
            System.out.println(str);
            System.out.println("The kth digit is:- " + str.charAt(k-1));
            return;
        }
        // For first recursive call
        if(current == 1){
            str += "0";
            findBinaryNumber(current + 1, n, str, k);

        }
        // For other cases
        else{
            str = str + "1" + reverse(invert(str));
            findBinaryNumber(current + 1, n, str, k);
        }
    }
    public static String invert(String str){
        String to_return = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '0'){
                to_return += '1';
            }else{
                to_return += '0';
            }
        }
        return to_return;
    }
    public static String reverse(String str){
        int index = str.length() - 1;
        String ans = "";
        while(index >= 0) {
            ans += str.charAt(index);
            index--;
        }
        return ans;
    }
}
