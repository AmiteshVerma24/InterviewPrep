package Algorithms.Sorting;

import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int [] unsorted = {45,23,67,1,34,76,9,5,109};
        System.out.println(Arrays.toString(mergeSort(unsorted)));
    }
    // public static int[] inPlaceMergeSort(int [] arr, int start, int end){
    //     if(start == end) return arr;
    //     int mid = start + (end - start) / 2;
    //     return mergeInPlace(inPlaceMergeSort(arr, start, mid), inPlaceMergeSort(arr, mid+1, end));
    // }
    // public static int[] mergeInPlace(int [] left, int [] right){
        
    // }
    public static int[] mergeSort(int [] arr){
        // Base condition
        if(arr.length == 1) return arr;
        int mid = arr.length / 2;
        // Partition the array into two parts
        int [] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int [] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        // Merge the two parts into one
        return merge(left, right);
    }
    public static int[] merge(int [] left , int [] right){
        int index1 = 0, index2 = 0, index = 0;
        int [] new_arr = new int[left.length + right.length];
        while (index1 < left.length && index2 < right.length) {
            if(left[index1] < right[index2]){
                new_arr[index] = left[index1++];
            }
            else{
                new_arr[index] = right[index2++];
            }
            index++;
        }
        while (index1 < left.length) {
            new_arr[index++] = left[index1++];
        }
        while (index2 < right.length) {
            new_arr[index++] = right[index2++];
        }
        return new_arr;
    }
}


