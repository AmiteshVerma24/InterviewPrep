package Recursion.Strings;
import java.util.*;

class StringPermutation {
    public static void main(String[] args) {
        String str = "abc";
        print_permutation("", str);
        System.out.println(return_list_permutation("", str));
    }
    static void print_permutation(String processed, String un_processed){
        if(un_processed.isEmpty()){
            System.out.println(processed);
            return;
        };
        int number_of_recursion_calls = processed.length();
        for (int i = 0; i <= number_of_recursion_calls; i++) {
            String first_substring = processed.substring(0, i);
            String second_substring = processed.substring(i, processed.length());
            print_permutation(first_substring + un_processed.charAt(0) + second_substring, un_processed.substring(1));
        }
    }
    static List<String> return_list_permutation(String processed, String un_processed){
        List<String> lst = new ArrayList<>();
        if(un_processed.isEmpty()){
            lst.add(processed);
            return lst;
        }
        for(int i = 0 ; i <= processed.length() ; i++){
            String first = processed.substring(0, i);
            String second = processed.substring(i , processed.length());
            lst.addAll(return_list_permutation(first + un_processed.charAt(0) + second, un_processed.substring(1)));
        }
        return lst;
    }
}
