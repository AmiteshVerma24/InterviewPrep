class FindSqrt {
    public static void main(String[] args) {
        int num = 40;
        int precision = 3;
        System.out.println(sqrt(num, precision));
    }
    public static double sqrt(int num, int precision){
        // Firt we find the number before decimal
        int start = 0, end = num, mid;
        double root = 0.0;
        while(start <= end){
            mid = start + (end - start) / 2;
            if(mid * mid == num){
                return num;
            }
            else if(mid * mid > num){
                end = mid - 1;
            }
            else{
                start = mid + 1;
                root = mid;
            }
        }
        double increment = 0.1;
        // Finding the floating number
        for(int i = 0 ; i < precision ; i++){
            while(root * root < num){
                root += increment;
            }
            root -= increment;
            increment /= 10;
        }
        return root;

    }
}
