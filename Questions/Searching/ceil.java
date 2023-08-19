package Questions.Searching;

public class ceil {
    public static void main(String[] args) {
        int[] nums = {1, 4, 15, 19, 23, 26, 33, 45, 78, 99, 101};
        int target = 102;
        int index = find_ceil(nums, target);
        System.out.println("The index is: "+index);
    }
    static int find_ceil(int[] arr, int target){
        // If array is empty
        if(arr.length < 1){
            return -1;
        }
        // If the largest element in the array is smallar than target
        if(arr[arr.length - 1] < target){
            return - 1;
        }
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while(start <= end){
            mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
            
        }
        return start;
    }
}
