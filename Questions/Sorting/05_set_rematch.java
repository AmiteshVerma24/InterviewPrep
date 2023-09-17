package Questions.Sorting;
import java.util.*;
// https://leetcode.com/problems/set-mismatch/description/
 class set_mismatch {

    public static void main(String[] args) {
        int [] nums = {1,2,2,4};
        set_mismatch(nums);
    }
    public static void set_mismatch(int[] nums) {
        int index = 0;
        int ans[] = {0,0};
        while(index < nums.length){
            int correct_index = nums[index] - 1;
            if(nums[index] != nums[correct_index]){
                swap(nums,index,correct_index);
            }else{
                index++;
            }
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != i + 1){
                ans[0] = nums[i];
                ans[1] = i+1;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
    public  static void swap(int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
}
