package Recursion.Easy;

class CountNumberOfZeros {
    public static int count_zeros(int num){
        if(num == 0) return 0;
        int is_last_zero = (num % 10) == 0 ? 1 : 0;
        return is_last_zero + count_zeros(num/10);
    }

    public static int count_zeros_with_variable(int num, int count){
        if(num == 0) return count;
        int last_digit = num % 10;

        if(last_digit == 0){
            return count_zeros_with_variable(num / 10, ++count);
        }
        return count_zeros_with_variable(num / 10, count);
    }
    public static void main(String[] args) {
        System.out.println(count_zeros(10000490));
        System.out.println(count_zeros_with_variable(10000490, 0));
    }
}
