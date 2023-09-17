package Questions.Sorting;
import java.util.*;

 class find_duplicates {

    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        findDuplicate(nums);
    }
    public  static List<Integer> findDuplicate(int[] nums) {
        int index = 0;
        while(index < nums.length){
            int correct_index = nums[index] - 1;
            if(nums[index] != nums[correct_index]){
                swap(nums,index,correct_index);
            }else{
                index++;
            }
        }
        List<Integer> lst = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] - 1!= i){
                lst.add(nums[i]);
            }
        }
        System.out.println(lst);
        return lst;
    }
    public  static void swap(int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
}
