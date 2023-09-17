package Questions.Searching;

import java.util.Arrays;

// https://leetcode.com/problems/rotate-array/
class rotate_array {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 3;
        Approach_One(nums, count);

    }
    // This solves the problem but for very large array size the time taken is very large
    // Here we start the switching from the first element and go till the end
    public static void Approach_One(int[] nums, int k){
        if(k == 0) return;
        int first_element = 0, second_element = nums[0],index = 0;
        while(k > 0){
            for(int i = 0 ; i < nums.length ; i++){
                index = (i+1) % nums.length;
                first_element = second_element;
                second_element = nums[index];
                nums[index] = first_element;
            }
            second_element = nums[0];
            k--;
        }
        nums[index] = first_element;
        System.out.println("Using approach one we get:- "+ Arrays.toString(nums));
    }
}
