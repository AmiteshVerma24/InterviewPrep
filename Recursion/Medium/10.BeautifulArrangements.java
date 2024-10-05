package Recursion.Medium;
import java.util.*;

class BeautifulArrangements{
    public static void main(String[] args) {
        String str = "";
        int n = 3;
        for (int i = 1; i <= n; i++) {
            str += i;
        }
        System.out.println(find_beautiful_arrangements(n, -1, "", str));

    }

    public static int find_beautiful_arrangements(int n, int current_index, String processed, String unprocessed) {
        int count = 0;
        // Check before only if the string being added is valid or not
        if (current_index >= 0 && Character.getNumericValue(processed.charAt(current_index)) % (current_index + 1) != 0 && (current_index + 1) % Character.getNumericValue(processed.charAt(current_index)) != 0) {
            return 0;
        }
        // If length == n check if the string is beautiful
        if (processed.length() == n) {
            System.out.println(processed);
            return 1;
        }
        // Else continue to find all possible substrings
        for(int i = 0 ; i < unprocessed.length() ; i++) {
            count += find_beautiful_arrangements(n, current_index + 1, processed + unprocessed.charAt(i), unprocessed.substring(0, i) + unprocessed.substring(i+1));
        }
        return count;
    }
}