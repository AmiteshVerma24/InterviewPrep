package Algorithms.Sorting;

import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
        int [] nums = {5, 3, 4, 1, 2, 6, 9, 8, 7};
        sort(nums);
    }
    public static void sort(int[] arr){
        int index = 0;
        while(index < arr.length){
            // If not at correct index swap
            int correct_index = arr[index] - 1;
            if(arr[index] != arr[correct_index]){
                swap(arr, index, correct_index);
            }
            // If at correct index move to next index
            else{
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
