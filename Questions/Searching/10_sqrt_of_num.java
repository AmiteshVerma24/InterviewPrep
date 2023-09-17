package Questions.Searching;
// https://leetcode.com/problems/sqrtx/
 class sqrt_of_num {
    public static void main(String[] args) {
        int num = 2147395599;
        System.out.println(binary_search_sqrt(num));
        System.out.println(sqrt_repeted_subtraction(num));
    }
    // Using binary search
    public static int binary_search_sqrt(int x){
        int start = 1, end = x, mid;
        while(start <= end){
            mid = start + (end - start)/2;
            // Have to type cast as the multiplicaton can result in number which is greater than the integer limit
            if((long) mid*mid == (long) x){
                return mid;
            }
            else if((long) mid*mid < (long)x){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return end;
    }
    // Using repeated subtration method
    public static int sqrt_repeted_subtraction(int x) {
        // Using property to find the sqrt using repeated subtraction
        int sqrt = 0, oddNumber = 1;
        while(x - oddNumber >= 0){
            x = x - oddNumber;
            oddNumber = oddNumber + 2;
            sqrt++;
        }
        return sqrt;
    }
}
