package Recursion.Medium;

class KthElementOfGrammar {
    public static void main(String[] args) {
        // System.out.println(Convert_Grammar("01"));
        // System.out.println(Grammar("", "0", 1, 30 , 434991989));
        System.out.println(Grammar("", "0", 1, 10 , 2));
    }
    public static char Grammar(String current, String previous, int current_cycle, int n, int k){
        System.out.println(current_cycle + "->" + previous);
        if(current_cycle == n){
            return Convert_Grammar(previous).charAt(k - 1);
        }
        return Grammar("", Convert_Grammar(previous), current_cycle + 1, n, k);
    }
    public static String Convert_Grammar(String str){
        String ans = "";
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == '0'){
                ans += "01";
            }else{
                ans += "10";
            }
        }
        return ans;
    }
}
