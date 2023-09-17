package Questions.Sorting;
// https://leetcode.com/problems/missing-number/

import java.util.Arrays;

class missing_number {
    public static void main(String[] args) {
        int nums [] = {0, 3, 4, 5, 2};
        int ans = find_missing(nums);
        System.out.println("The missing number is: "+ ans);

    }
    public static int find_missing(int arr []){
        int ans, index = 0;
        // Apply cycle sort if we have arr[index] = n ignore it
        while(index < arr.length){
            int correct_index = arr[index];
            if(arr[index] < arr.length && arr[index] != arr[correct_index]){
                swap(arr, index, correct_index);
            }
            else{
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
        // Now when we have sorted the array 
        // CASE 1: When the element n is in array - first element that is not in position is the ans
        // CASE 2: n is ans
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != i){
                return i;
            }
        }
        return arr.length;
            
    }
    public static void swap(int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
