package Questions.Searching;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class two_sum_array_is_sorted {
    public static void main(String[] args) {
        int [] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int first = 0, last = numbers.length - 1;
        while(numbers[first] + numbers[last] != target){
            if(numbers[first] + numbers[last] > target) last --;
            else first++;
        }
        return  new int[] {first+1, last+1};
    }
}
