package Recursion.Strings;

class CountNumberOfPermutationsOfString {
    public static void main(String[] args) {
        String str = "abfgh";
        System.out.println("The number of permutations are:- " + count_number_of_permutation("", str));
    }
    static int count_number_of_permutation(String processed, String un_processed){
        int count = 0;
        if(un_processed.isEmpty()){
            return count + 1;
        }
        for(int i = 0 ; i < processed.length() + 1 ; i++){
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            count = count + count_number_of_permutation(first + un_processed.charAt(0) + second, un_processed.substring(1));
        }
        return count;
    }
}
