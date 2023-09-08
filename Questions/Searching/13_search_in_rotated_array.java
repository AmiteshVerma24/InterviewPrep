package Questions.Searching;
// https://leetcode.com/problems/search-in-rotated-sorted-array/
 class search_in_rotated_array {
    public static void main(String[] args) {
        // int nums[] = {5,6,7,8,9,10,11,12,13,14,0,1,2,3,4};
        int nums[] = {5,1,3};
        int target = 3;
        int pivot_index = find_pivot_index(nums);
        System.out.println("Pivout index: "+ pivot_index);
        int result = 0;
        if(pivot_index == -1){
            result =  binary_search(nums,target,0,nums.length - 1);
        }
        else{
            result = binary_search(nums,target,0,pivot_index);
            // System.out.println(result);
            if(result == -1){
                result =  binary_search(nums,target,pivot_index+1,nums.length - 1);
                // System.out.println(result);
            }
        }
        System.out.println(result);
    }

    public static int find_pivot_index(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while(start <= end){
            mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] >= arr[start]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binary_search(int[] nums, int target, int start, int end){
        if(nums.length < 1){
            return -1;
        }
        int mid;
        boolean dir = (nums[start] < nums[end]);
        while(start <= end){
            mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(dir){
                if(nums[mid] > target){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
            else{
                if(nums[mid] > target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
