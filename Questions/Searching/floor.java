package Questions.Searching;

public class floor {
    public static void main(String[] args) {
        int[] nums = {1, 4, 15, 19, 23, 26, 33, 45, 78, 99, 101};
        int target = 25;
        int index = find_floor(nums, target);
        System.out.println("The index is: "+index);
    }
    static int find_floor(int[] arr, int target){
        // If array is empty
        if(arr.length < 1){
            return -1;
        }
        // If the smallest element in the array is larger than target
        if(arr[0] > target){
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
        return end;
    }
}
