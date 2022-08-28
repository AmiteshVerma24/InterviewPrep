package Arrays;
import java.util.Scanner;

public class removeEven{
    static void remove(int []myArr){
        // int [] myArr = {2 , 3 , 4 , 5};
        // Counting number of odd integers
        int oddNum = 0;
        for (int i = 0 ; i < myArr.length ; i++){
            if (i % 2 != 0){
                oddNum++;
            }
        }
        // Creating array to store odd integers
        int oddArr[] = new int[oddNum];
        // Storing the odd integers in the array
        int index = 0;
        for (int i = 0 ; i < myArr.length ; i++){
            if (myArr[i] % 2 != 0){
                oddArr[index] = myArr[i]; 
                index++;
            }
        }     
        // Printing the array
        for(int i = 0 ; i < oddArr.length ; i++){
            System.out.print(oddArr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:- ");
        int length = input.nextInt();

        int arr[] = new int [length];
        System.out.println("Enter the elements of array:- ");
        for(int i = 0 ; i < length ; i++){
            System.out.print("Enter element at " + (i+1) + " position:- ");
            arr[i] = input.nextInt();
        }
        remove(arr);
        input.close();

    }
}