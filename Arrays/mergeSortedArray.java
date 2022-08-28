package Arrays;
// I/P => 
// a1 = {1 , 3 , 4 , 5}  , a2 = {2 , 6 , 7 ,8}
// O/P=>
// a = {1 , 2 , 3 , 4 , 5 , 6 , 7 ,8}

public class mergeSortedArray {
    static void merge(){
        // Taking two arrays
        int arr1[] = {1 ,3 ,4 ,5};
        int arr2[] = {2 ,6 ,7 ,8};
        // New array to store the integers
        int arr[] = new int [arr1.length + arr2.length];
        int index1 = 0 , index2 = 0 , i = 0;
        // Comparing the elements till we reach end of one of the array
        while (index1 < arr1.length && index2 < arr2.length){
            if (arr1[index1] < arr2[index2]){
                arr[i] = arr1[index1];
                index1++;
                i++;
            }else{
                arr[i] = arr2[index2];
                index2++;
                i++;
            }
        }
        // Filling remaining elements
        while(index1 < arr1.length){
            arr[i] = arr1[index1];
            index1++;
            i++;
        }
        while(index2 < arr2.length){
            arr[i] = arr2[index2];
            index2++;
            i++;
        }
        for(int index = 0 ; index < arr.length ; index++){
            System.out.print(arr[index] + " ");
        }
    }
    public static void main(String[] args) {
        merge();
    }    
}
