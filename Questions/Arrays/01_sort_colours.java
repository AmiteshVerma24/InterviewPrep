package Questions.Arrays;
import java.util.*;
// https://leetcode.com/problems/sort-colors/description/

class sort_colours {
    public static void main(String[] args) {
        int arr[] = {2,0,1};
        DNF(arr);
    }
    // Brute force using 3 pointers
    public static void method1(int nums[]){
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0) {
                zero++;
            }else if(nums[i] == 1){
                one++;
            }else{
                two++;
            }
        }
        int index = 0;
        while(index < zero){
            nums[index] = 0;
            index++;
        }
        while(index < zero + one){
            nums[index] = 1;
            index++;
        }
        while(index < zero + one + two){
            nums[index] = 2;
            index++;
        }
        System.out.println(Arrays.toString(nums));
    }
    // Dutch national flag algo
    public static void DNF(int [] nums){
        int low = 0, mid = 0, high = nums.length - 1;
        while(mid <= high){
            if(mid == 0){
                swap(nums,low,high);
                low++;
                mid++;
            }
            else if(mid == 1){
                mid++;
            }
            else{
                swap(nums, mid, high);
                high--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void swap(int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
}
