package Arrays;


// I/P -> {3 ,-2 ,4 ,-7 , 1 , 5 , -10}
// O/P -> {-2 ,-7 ,-10, 3, 4, 1, 5}

public class rearrangePositiveNegative {

    static void rearrange(int [] arr){
        // New array to store the rearrange array
        int [] new_arr = new int[arr.length]; 
        // Taking count of number of negative elements
        int neg = 0; 
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] < 0){
                neg++;
            }
        }
        // Rearraning the array
        int index = 0;
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] < 0){
                new_arr[index] = arr[i];
                index++;
            }
        }
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] >= 0){
                new_arr[index] = arr[i];
                index++;
            }
        }
        // Printng array
        for (int i = 0 ; i < new_arr.length ; i++){
            System.out.print(new_arr[i] + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int myArr[] = {3 ,-2 ,4 ,-7 , 1 , 5 , -10};
        rearrange(myArr);
        
    }
}
