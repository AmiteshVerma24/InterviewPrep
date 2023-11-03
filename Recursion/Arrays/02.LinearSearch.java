package Recursion.Arrays;

class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 8, 7};
        System.out.println(linearSearch(arr, 0, 3));
    }    
    static boolean linearSearch(int [] arr, int index, int target){
        if (arr[index] == target) return true;
        if (index == arr.length - 1) return false;
        return linearSearch(arr, index+1, target);
    }
}
