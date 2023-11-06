package Recursion.Pattern;

import java.util.Arrays;

class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {4, 3, 2, 1};
        System.out.println(Arrays.toString(bubble_sort(arr, arr.length - 1, 0)));
    }
    public static int [] bubble_sort(int [] arr, int row, int col){
        if(row == 0) return arr;
        if(col < row){
            if(arr[col] > arr[col + 1]){
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            return bubble_sort(arr, row, col + 1);
        }
        else{
            return bubble_sort(arr, row - 1, 0);
        }
    }
}
