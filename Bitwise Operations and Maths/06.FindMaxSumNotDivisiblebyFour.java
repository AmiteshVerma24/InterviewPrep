// Given n numbers such that their sum is not divisible by 4, remove k numbers such that after every removal, the sum of the remaining numbers is not divisible by 4. Find the maximal sum of n-k remaining numbers.
import java.util.*;

class FindMaxSumNotDivisiblebyFour {
    public static void main(String[] args) {
        int arr []  = {44, 12, 45, 23, 22, 34, 47, 37, 50, 31};
        int sum = findSum(arr);
        int k = 1;
        Arrays.sort(arr);
        
        System.out.println(sum);
        System.out.println(Arrays.toString(arr));
        for(int j = 1 ; j < 11 ; j++){
            k = j;
            for(int i : arr){
            if(k <= 0){
                break;
            }
            int temp_sum = sum - i;
            if(temp_sum % 4 != 0){
                sum = temp_sum;
                k -= 1;
            }
        }
        System.out.println(sum);
        }
        
    }
    public static void findMaximumSum(int [] arr){

    }
    public static int findSum(int [] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
}
