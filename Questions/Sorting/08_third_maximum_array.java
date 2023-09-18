package Questions.Sorting;
// https://leetcode.com/problems/third-maximum-number/
class third_maximum_array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,89,12,3,34,4545,4,4,3545};
        System.out.println(thirdMax(arr));
    }
    public static int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sec = 0, third = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > max){
                third = sec;
                sec = max;
                max = nums[i];
            }
        }
        System.out.println(max);
        System.out.println(sec);
        return third;
    }
}
