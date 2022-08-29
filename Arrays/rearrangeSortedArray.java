package Arrays;

// I/P -> {1,2,3,4,5,6}
// O/P -> {6,1,5,2,4,3}

public class rearrangeSortedArray {
    static void rearrange(int arr[]){
        int max_index = arr.length - 1;
        int min_index = 0;
        int [] newArr = new int [arr.length];
        boolean switchIndex = true;
        for (int i = 0 ; i < arr.length ; i++){
            if (switchIndex){
                newArr[i] = arr[max_index];
                max_index--;
            }else{
                newArr[i] = arr[min_index];
                min_index++;
            }
            switchIndex = !switchIndex;
        }
        System.out.println("The rearranged array is:");
        for(int i = 0 ; i < newArr.length ; i++){
            System.out.print(newArr[i] + " ");
        }

    }
    public static void main(String[] args) {
        int myArr[] = {1,2,3,4,5,6};
        rearrange(myArr);
    }
}
