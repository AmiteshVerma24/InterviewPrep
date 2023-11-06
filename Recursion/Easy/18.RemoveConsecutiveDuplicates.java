package Recursion.Easy;

/* https://www.geeksforgeeks.org/remove-consecutive-duplicates-string/
Input: S= “aaaaabbbbbb”
Output: ab
*/

class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("geeksforgeeks", "", 0));
    }
    public static String removeDuplicates(String str, String new_str, int index){
        if(index == str.length()){
            return new_str;
        }
        if(index == 0) {
            new_str += str.charAt(index);
        }
        if(new_str.charAt(new_str.length() - 1) != str.charAt(index)){
            new_str += str.charAt(index);
        }
        return removeDuplicates(str, new_str, index+1);
    }
}
