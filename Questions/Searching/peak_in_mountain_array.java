package Questions.Searching;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class peak_in_mountain_array {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,8,7,6,5,4,3,2,1};
        // Expected output:- 7
        int ans = find_peak(arr);
        System.out.println(ans);
    }

     static int find_peak(int nums []){
        int start = 0, end = nums.length - 1, mid;
        while(start < end){
            mid = start + (end - start) / 2;
            if(nums[mid+1] > nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}
