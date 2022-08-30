package Arrays;
// I/P-> {-4,2,-5,3,6} , w = 3
// O/P-> {2,3,6}

public class maxSlidingWindow {
    // Initial Approach
    static void findMax(int arr[] , int w){
        int maxArr[] = new int[arr.length - (w-1)];
        for (int i = 0 ; i < arr.length - (w-1) ; i++){
            int max = -999;
            for (int j = i ; j < i + w ; j++){
                if (arr[j] > max){
                    max = arr[j];
                }
            }
            if (i < arr.length - (w-1)){
                maxArr[i] = max;
            }
            max = 0;
        }
        for(int i = 0 ; i < maxArr.length ; i++){
            System.out.print(maxArr[i] + " ");
        }
        System.out.println(" ");
    }

    // Better approach
    static void max(int []arr , int w){

    }
    
    public static void main(String[] args) {
        int myArr[] = {-4,2,-5,3,6};
        int window = 3;
        findMax(myArr, window);

    }
    
}
