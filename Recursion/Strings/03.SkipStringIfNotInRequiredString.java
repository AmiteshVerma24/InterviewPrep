package Recursion.Strings;

 class SkipStringIfNotInRequiredString {
    public static void main(String[] args) {
        String to_skip = "app";
        String required = "apple";
        String to_compare = "appiloveapplereally";
        System.out.println(skip(to_skip, required, to_compare));
    }
    public static String skip(String to_skip , String required , String current_string){
        if(current_string.isEmpty()) return "";
        if(current_string.startsWith(required)) return current_string.substring(0, 4) + skip(to_skip, required, current_string.substring(5));
        if(current_string.startsWith(to_skip)) return skip(to_skip, required, current_string.substring(3));
        return current_string.charAt(0) + skip(to_skip, required, current_string.substring(1));
    }
}
