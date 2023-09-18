package Questions.Sorting;
import java.util.*;
// https://leetcode.com/problems/contains-duplicate/description/
 class contains_duplicates {

    public static void main(String[] args) {
        int [] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int ptr1 = 0, ptr2 = 1;
        while(ptr2 < nums.length){
            if(nums[ptr1] == nums[ptr2]) return true;
            ptr1++;
            ptr2++;
        }
        return false;
    }
}
