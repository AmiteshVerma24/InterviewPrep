package Algorithms;
import java.util.*;
import java.math.*;

class random_number_generator{
    public int generate_random(){
        int random_number = (int)(Math.random()*(100+1));
        return random_number;
    }
}

public class sorting_algorithms {
    int array[];
    public sorting_algorithms(int size){
        this.array = new int[size];
    }
    // To generate an array of random integers
    public void generate_random_array(int size){
        for(int i = 0 ; i < size ; i++){
            random_number_generator generator = new random_number_generator();
            int num = generator.generate_random();
            this.array[i] = num;
        }
    }
    // Selection sort
    public void selection_sort(int arr[]){
        int length = arr.length;
        for(int i = 0 ; i < length ; i++){
            int index_minimum = i;
            for(int j = i+1; j < length ; j++){
                if(arr[j] < arr[index_minimum]){
                    int temp = arr[index_minimum];
                    arr[index_minimum] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    // Bubble sort
    public void bubble_sort(int arr[]){
        int length = arr.length;
        for (int i = 0 ; i < length ; i++){
            for (int j = i ; j < length-i-1 ; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    // Insertion sort
    public void insertion_sort(int arr[]){
        int length = arr.length;
        for (int i = 1 ; i < length ; i++){
            int hole_value = arr[i];
            int hole = i;
            while(hole_value < arr[hole-1] && hole > 0){
                arr[hole] = arr[hole-1];
                hole--;
            }
            arr[hole] = hole_value;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        // New scanner
        Scanner sc = new Scanner(System.in);
        // Asking the user for the size of the array
        System.out.print("Enter the size of the array to sort:- ");
        int size = sc.nextInt();
        // Object of sorting algorithms
        sorting_algorithms sa = new sorting_algorithms(size);
        sa.generate_random_array(size);
        System.out.println(Arrays.toString(sa.array));
        sa.selection_sort(sa.array);
        sa.bubble_sort(sa.array);
        sa.insertion_sort(sa.array);
        sc.close();
    }
}
