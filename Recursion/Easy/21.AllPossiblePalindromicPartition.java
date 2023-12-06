package Recursion.Easy;
// https://www.geeksforgeeks.org/given-a-string-print-all-possible-palindromic-partition/
// Input: nitin
// Output: n i t i n
// n iti n
// nitin


class AllPossiblePalindromicPartition {
    public static void main(String[] args) {
        find_palindrome("", "nitin");
    }
    static void find_palindrome(String processed , String un_processed){
        if(check_palindrome(processed)) System.out.println(processed);;
        if (un_processed.isEmpty()) {
            return;
        } 
        for (int i = 0; i < un_processed.length(); i++) {
            find_palindrome(processed + un_processed.charAt(i), un_processed.substring(1));
        }

    }
    static boolean check_palindrome(String str){
        if(str.isEmpty()) return false;
        int start = 0, end = str.length() - 1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
