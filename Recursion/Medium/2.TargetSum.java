package Recursion.Medium;
// https://leetcode.com/problems/target-sum/

class TargetSum {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2};
        // target_sum(arr, 3, "", 0);
        System.out.println(target_sum_no_string(arr, 4, 0, 0));
    }

    public static int target_sum_no_string(int [] nums, int target, int sum, int index){
        // We found one combination
        if(sum == target && index == nums.length){
            return 1;
        }
        if(index == nums.length) {
            return 0;
        }
        // Add with next element
        int add = target_sum_no_string(nums, target, sum + nums[index], index + 1);
        // Subtract with next element
        int subtract = target_sum_no_string(nums, target, sum - nums[index], index + 1);
        return add + subtract;
    }

}
