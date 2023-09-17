package Questions.Sorting;

import java.util.*;

class elements_disappeared_from_array {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        find_disappeared(arr);
    }

    public static void find_disappeared(int [] nums){
        int index = 0;
        while(index < nums.length){
            int correct_index = nums[index] - 1;
            if(nums[index] != nums[correct_index]){
                swap(nums, index, correct_index);
            }else{
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));
        // Find the missing numbers
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] - 1 != i){
                lst.add(i+1);
            }
        }
        System.out.println(lst);


    }

    public static void swap(int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
