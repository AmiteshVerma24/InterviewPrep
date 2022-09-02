package Arrays;
// I/P => {1,10,20,0,59,63,0,88,0}
// O/P => {0,0,0,1,10,20,59,63,88}
// No new array and the non-zero elements order should not change
public class moveZeroToStart {
    static void move(int [] arr){
        int read = arr.length - 1 , write = arr.length - 1;
        while (read >= 0){
            if (arr[read] != 0){
                arr[write] = arr[read];
                write--;
            }
            read--;
        }
        while (write >= 0){
            arr[write] = 0;
            write--;
        }
        System.out.println(" ");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int [] myArr = {1,10,20,0,59,63,0,88,0};
        move(myArr);
    }
}
