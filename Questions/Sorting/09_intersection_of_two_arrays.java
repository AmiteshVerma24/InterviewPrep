package Questions.Sorting;
import java.util.*;

class intersection_of_two_arrays {
    public static void main(String[] args) {
        int [] nums1 = {4,9,5};
        int [] nums2 = {9,4,9,8,4};
        intersection(nums1,nums2);
    }

     public static void intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>(); 
        if(nums1.length < nums2.length){
            for(int i = 0 ; i < nums1.length ; i++){
                boolean exist = binary_search(nums2 , nums1[i]);
                if(exist && list.contains(nums1[i]) == false){
                    list.add(nums1[i]);
                }
            }
        }else{
            for(int i = 0 ; i < nums2.length ; i++){
                boolean exist = binary_search(nums1 , nums2[i]);
                if(exist && list.contains(nums2[i]) == false){
                    list.add(nums2[i]);
                }
            }
        }
        
        System.out.println(list);
    }
    public static boolean binary_search(int[] nums , int target){
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while(start <= end){
            mid = start + (end - start)/2;
            if(nums[mid] == target){
                return true;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }
}
