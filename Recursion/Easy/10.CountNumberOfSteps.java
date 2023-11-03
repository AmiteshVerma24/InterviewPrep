package Recursion.Easy;

 class CountNumberOfSteps {
    public static void main(String[] args) {
        System.out.println(count_steps(41, 0));
    }
    public static int count_steps(int num , int count){
        if (num == 0) return count;
        if (num % 2 == 0) return count_steps(num / 2, count+1);
        return count_steps(num-1, count+1);
    }
}
