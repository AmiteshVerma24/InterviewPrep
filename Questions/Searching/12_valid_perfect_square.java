package Questions.Searching;

 class valid_perfect_square {
    public static void main(String[] args) {
        int number = 16;
        if(isPerfectSquare(number)) System.out.println("Is a perfect square!");
        else System.out.println("Not a perfect square!");
    }
    public static  boolean isPerfectSquare(int num) {
        int start = 1, end = num, mid;
        while(start <= end){
            mid = start + (end - start) / 2;
            if((long) mid * mid == (long)num){
                return true;
            }
            else if((long)mid * mid < (long)num){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
}
