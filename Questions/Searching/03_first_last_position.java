package Questions.Searching;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

 class first_last_position {
    public static void main(String[] args) {
        int [] nums = {3,5,6,7,7,7,7,7,7,8,9,10};
        int [] ans = new int[2];
        int target = 7;
        // Expected output => [3,8]
        if(isPresent(nums, target) == -1 || nums.length < 1) {
            System.out.println("Element not found!");
        }
        else{
            ans[0] = findFirstPosition(nums, target);
            ans[1] = findLastPosition(nums, target);
            System.out.println(Arrays.toString(ans));
        }
    }
    static int findFirstPosition(int [] arr, int target){
        int start = 0; 
        int end = arr.length - 1;
        int mid;
        while(start <= end){
            mid = (start+end)/2;
            if(arr[mid] >= target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    static int findLastPosition(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while(start <= end){
            mid = (start + end) / 2;
            if(arr[mid] > target){
                end = end - 1;
            }else{
                start = start + 1;
            }
        }
        return end;
    }
    static int isPresent(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while(start <= end){
            mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = end - 1;
            }else{
                start = start + 1;
            }
        }
        return -1;
    }
}
