package Questions.Searching;

class rotation_count {
    public static void main(String[] args) {
        int nums [] = {5,6,7,1,2,3,4};
        int pivot_index = find_number_of_rotation(nums);
        if(pivot_index == -1){
            System.out.format("Number of rotations is: %d",0);
        }
        else{
            System.out.format("Number of rotations is: %d",pivot_index+1);
        }
    }
    public static int find_number_of_rotation(int arr []){
        int start = 0, end = arr.length - 1, mid;
        while(start <= end){
            mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[start] < arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
