package Recursion.Strings;

class RemoveApple {
    public static void main(String[] args) {
        // System.out.println("Amitesh".substring(4));
        String str = "iloveapplereally";
        System.out.println(removeApple(str));
    }    
    public static String removeApple(String str){
        if(str.isEmpty()) return "";
        if(str.startsWith("apple")) return removeApple(str.substring(5));
        return str.charAt(0) + removeApple(str.substring(1));
    }
}
