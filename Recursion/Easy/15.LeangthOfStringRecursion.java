package Recursion.Easy;
// https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
class LeangthOfStringRecursion {
    public static void main(String[] args) {
        String str = "Amitesh";
        System.out.println(length(str));
    }   
    // str.substring(begin index) -> It returns the string from the begin index to the end  
    public static int length(String str){
        if(str == "") return 0;
        return length(str.substring(1)) + 1;
    }
}
