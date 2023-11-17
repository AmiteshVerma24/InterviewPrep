package Recursion.Strings;
class RemoveA {
    public static void main(String[] args) {
        String str = "baccad";
        String ans = "";
        System.out.println(approach1(str, ans, 0));
        System.out.println(approach2(str, 0));
    }
    // Passing the answer variable in the function
    public static String approach1(String str, String ans, int index){
        if(index >= str.length()) return ans;
        if(str.charAt(index) != 'a'){
            ans += str.charAt(index);
        }
        return approach1(str, ans, index+1);
    }
    // Creating ans at each recursion call
    public static String approach2(String str, int index){
        if(index >= str.length()) return "";
        if(str.charAt(index) != 'a'){
            return str.charAt(index) + approach2(str, index+1);
        }
        return approach2(str,index+1);
    }
}

