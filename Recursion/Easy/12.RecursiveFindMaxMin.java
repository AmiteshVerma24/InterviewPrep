package Recursion.Easy;
// https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/

import java.util.ArrayList;

class RecursiveFindMaxMin {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6, 90, -1, -90, 100, 120};
        ArrayList<Integer> array = recursive_max_min(arr, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        System.out.println(array.toString());
    }    
    public static ArrayList<Integer> recursive_max_min(int [] arr, int current_max, int current_min, int index){
        if(index == arr.length - 1) {
            ArrayList<Integer> final_arr = new ArrayList<>();
            final_arr.add(current_max);
            final_arr.add(current_min);
            return final_arr;
        }
        if(arr[index] < current_min) {
            current_min = arr[index];
        }
        if(arr[index] > current_max) {
            current_max = arr[index];
        }
        return recursive_max_min(arr, current_max, current_min, index+1);
    }
}
