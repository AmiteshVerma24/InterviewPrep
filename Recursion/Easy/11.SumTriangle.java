package Recursion.Easy;
// https://www.geeksforgeeks.org/sum-of-natural-numbers-using-recursion/

import java.util.Arrays;

class SumTriangle {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        sum_triangle_recursive(arr);
    }
    public static void sum_triangle_recursive(int [] arr){
        if(arr.length - 1 < 0) return;
        int [] new_arr = new int[arr.length - 1];
        for(int i = 0 ; i < arr.length - 1 ; i++){
            for(int j = i ; j < i + 2 ; j++){
                new_arr[i] += arr[j];
            }
        }
        sum_triangle_recursive(new_arr);
        System.out.println(Arrays.toString(arr));
    }
}
