package Recursion.Easy;
import java.util.*;

// https://www.geeksforgeeks.org/powet-set-lexicographic-order/
// Input : abc
// Output : a ab abc ac b bc c

class PowerSet{
    public static void main(String[] args) {
        System.out.println(find_power_set("", "abcd"));
    }
    static List<String> find_power_set(String processed, String un_processed){
        List<String> lst = new ArrayList<>();
        if(un_processed.isEmpty()) {
            return lst;
        }
        for (int i = 0; i < un_processed.length(); i++) {
            lst.add(processed + un_processed.charAt(i));
            lst.addAll(find_power_set(processed + un_processed.charAt(i), un_processed.substring(i+1)));
        }
        return lst;
    }

}