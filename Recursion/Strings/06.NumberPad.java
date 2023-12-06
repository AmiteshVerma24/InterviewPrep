package Recursion.Strings;
import java.util.*;

class NumberPad {
    public static void main(String[] args) {
        String str = "869";
        // System.out.println((char)('a' + 3));
        // System.out.println('1' - '0');
        // find_combination("", str);
        System.out.println(return_list_find_combination("", str));
        
    }
    static void find_combination(String processed, String un_processed){
        if(un_processed.isEmpty()){
            System.out.println(processed);
            return;
        }
        int digit = un_processed.charAt(0) - '0';
        for(int i = 3 * (digit - 1) ; i < 3 * digit ; i++){
            char ch = (char) ('a' + i);
            find_combination(processed + ch, un_processed.substring(1));
        }
        
    }
    // Final answer with all edge cases
     static List<String> return_list_find_combination(String processed, String un_processed){
        List<String> lst = new ArrayList<>();
        if(un_processed.isEmpty()){
            lst.add(processed);
            return lst;
        }
        int digit = un_processed.charAt(0) - '0';
        if(un_processed.charAt(0) != '9'){
            for(int i = 3 * (digit - 1) ; i < 3 * digit ; i++){
                char ch = (char) ('a' + i);
                lst.addAll(return_list_find_combination(processed + ch, un_processed.substring(1)));
            }
        }else{
            for(int i = 3 * (digit - 1) ; i < 3 * (digit - 1) + 2 ; i++){
                char ch = (char) ('a' + i);
                lst.addAll(return_list_find_combination(processed + ch, un_processed.substring(1)));
            }
        }     
        return lst;      
    }
}
