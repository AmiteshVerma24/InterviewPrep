package Questions.Searching;
// https://leetcode.com/problems/kth-missing-positive-number/
 class kth_missing_number {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,10,11,13};
        int k = 2;
        int  num = 0, i = 1;
        while(k > 0){
            if(binary_search(arr, i) == -1){
                k--;
                num = i;
            }
            i++;
        }
        System.out.println(num);
    }
    public static int binary_search(int [] arr , int target){
        int start = 0, end = arr.length - 1, mid;
        while(start <= end){
            mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return target;
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
