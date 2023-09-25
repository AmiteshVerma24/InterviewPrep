package Questions.Arrays;
import java.util.*;
class rotate_array {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int k = 3;
        method_one(nums, k);
        System.out.println(Arrays.toString(nums));              // Original array changes
    }
    public static void method_one(int[] nums, int k){
        if(nums.length >= 2){
            int num = 0;
            while(num < k){
                int index = nums.length - 1;
                int temp = nums[0];
                    while(index >= 0){
                        nums[(index+1)%nums.length] = nums[index];
                        index = index - 1;
                    }
                nums[1] = temp;
                num++;
            }
        }
        System.out.println("Rotated array using method-1 is:- "+Arrays.toString(nums));
    }
}
