package Algorithms.Sorting;

import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int [] nums = {5, 3, 4, 1, 2};
        sort(nums);

    }

    public static void sort(int [] arr){
        for(int i = 0 ; i < arr.length - 1 ; i++){
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
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
