package Algorithms.Searching;
// Here we are implementing order agnostic binary search i.e it will check is the array is in ascending or decending order and proceed accordingly
public class binary_search {
    public static void main(String[] args) {
        // int[] nums = {1, 4, 15, 19, 23, 26, 33, 45, 78, 99, 101};
        int[] nums = {101, 98, 87, 67, 54, 43, 40, 32, 2, -1, -6};
        int target = -6;
        int index = order_agnostic_binary_search(nums, target);
        System.out.println("The index is: "+index);
    }
    static int order_agnostic_binary_search(int[] arr, int target){
        if(arr.length < 1){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        int mid;
        boolean dir = (arr[0] < arr[arr.length -1]);
        while(start <= end){
            mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(dir){
                if(arr[mid] > target){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
            else{
                if(arr[mid] > target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}
