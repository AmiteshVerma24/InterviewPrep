package Questions.Searching;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/

class maximum_value_at_given_index {
    public static void main(String[] args) {
        System.out.println(maxValue(4,2,6));
    }

   public static int maxValue(int n, int index, int maxSum) {
    int[] arr = new int[n];
    int remaining_sum = maxSum;
    int max = maxSum;
    boolean isContinue = true;
    int left = index - 1;
    int right = index + 1;

    while (isContinue) {
        arr[index] = maxSum;
        remaining_sum = max - maxSum;

        // Distribute remaining sum in left half and right half
        while (left >= 0 && remaining_sum > 0) {
            arr[left] += 1;
            remaining_sum--;
            left--;
        }

        while (right < n && remaining_sum > 0) {
            arr[right] += 1;
            remaining_sum--;
            right++;
        }

        // Check difference
        if (checkDifference(arr) == true) {
            isContinue = false;
        }
        maxSum = maxSum - 1;
    }
    System.out.println(Arrays.toString(arr));
    return arr[index];
}


    public static boolean checkDifference(int [] arr){
        int index1 = 0;
        int index2 = 1;

        while(index2 <= arr.length - 1){
            if((Math.abs(arr[index1] - arr[index2]) <= 1) == false){
                return false;
            }
            index1 = index2;
            index2++;

        }
        return true;
    }
}
