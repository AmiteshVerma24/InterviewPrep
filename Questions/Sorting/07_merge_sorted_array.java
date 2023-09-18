package Questions.Sorting;

import java.util.Arrays;

class merge_sorted_array {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        int m = 3, n = 3;
        System.out.println(Arrays.toString(merge(nums1,m,nums2,n)));
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1, index2 = n - 1,index = m+n-1;
        while(index1 >= 0 && index2 >= 0){
            if(nums1[index1] > nums2[index2]){
                nums1[index--] = nums1[index1--];
            }
            else{
                nums1[index--] = nums2[index2--];
            }
        }
        while(index1 >= 0){
            nums1[index--] = nums1[index1--];
        }
        while(index2 >= 0){
            nums1[index--] = nums2[index2--];
        }
        return nums1;
    }
}

