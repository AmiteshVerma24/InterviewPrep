package Arrays;

// I/P -> {1, 2, 3, 4, 5}
// O/P -> {5, 1, 2, 3, 4}

public class rightRotateArray {
    static void rotate(int [] arr){
        int last = arr[arr.length - 1];
        for(int i = arr.length - 1 ; i > 0 ; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        System.out.println("The rotated array is: ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int myArr[] = {1, 2, 3, 4, 5};
        rotate(myArr);
    }
}
