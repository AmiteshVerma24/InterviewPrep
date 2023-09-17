package Questions.Sorting;
// https://leetcode.com/problems/find-the-duplicate-number/description/
class find_duplicates {
    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        int index = 0;
        while(index < nums.length){
            int correct_index = nums[index] - 1;
            if(nums[index] != nums[correct_index]){
                swap(nums,index,correct_index);
            }else{
                index++;
            }
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] - 1!= i){
                return nums[i];
            }
        }
        return -1;
    }
    public static void swap(int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
