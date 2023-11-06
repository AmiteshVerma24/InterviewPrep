package Recursion.Pattern;

import java.util.Arrays;

class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {4, 3, 199, 2, 8, 1, 99};
        selection_sort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection_sort(int [] arr, int row, int col, int current_max){
        if(row == 0) return;
        if(col < row){
            if(arr[col] > arr[current_max]){
                selection_sort(arr, row, col + 1, col);
            }else{
                selection_sort(arr, row, col + 1, current_max);
            }
        }
        else{
            int temp = arr[current_max];
            arr[current_max] = arr[row - 1];
            arr[row - 1] = temp;
            selection_sort(arr, row - 1, 0, 0);
        }
    }
}
