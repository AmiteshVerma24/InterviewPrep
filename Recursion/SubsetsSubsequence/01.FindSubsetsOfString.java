package Recursion.SubsetsSubsequence;
import java.util.*;

class FindSubsetsOfString {
    public static void main(String[] args) {
        System.out.println(find_subsets_subsequence("", "abc"));
    }
    public static ArrayList<String> find_subsets_subsequence(String processed, String unprocessed){
        // We are not passing as an arguement for each function call we are creating new object and appending
        ArrayList<String> lst = new ArrayList<>();
        // Base condition
        if(unprocessed.isEmpty()){
            lst.add(processed);
            return lst;
        }
        // We select the character i.e left subtree
        lst.addAll(find_subsets_subsequence(processed + unprocessed.charAt(0), unprocessed.substring(1)));
        // We don't select the character i.e right subtree
        lst.addAll(find_subsets_subsequence(processed, unprocessed.substring(1)));
        return lst;
    }
}
