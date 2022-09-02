package Arrays;

// I/P -> arr = {1, 2, 3, 4, 5}
// O/P -> arr = {5, 1, 4, 2, 3}
public class arrayInMaxMin {
    static void rearrange(int []arr){
        // Using new array
        int [] myArr = new int [arr.length];
        boolean switchPlace = true;
        int max_index = arr.length - 1;
        int min_index = 0;
        for (int i = 0 ; i < arr.length ; i++){
            if (switchPlace){
                myArr[i] = arr[max_index];
                max_index--; 
            }
            else{
                myArr[i] = arr[min_index];
                min_index++;
            }
        }
        for (int i = 0 ; i < myArr.length ; i++){
            System.out.print(myArr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        rearrange(arr);
    }
}
