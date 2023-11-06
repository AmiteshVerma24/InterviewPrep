package Recursion.Easy;

class FindCapitalLetter {
    public static void main(String[] args) {
        String str = "amiteSh";
        System.out.println(find_capital_recursive(str, 0));
    }
    public static char find_capital_recursive(String str, int index){
        if(index == str.length()) return 'a';
        if(str.charAt(index) >= 'A' && str.charAt(index) <= 'Z'){
            return str.charAt(index);
        }
        return find_capital_recursive(str, index + 1);
    }
}
