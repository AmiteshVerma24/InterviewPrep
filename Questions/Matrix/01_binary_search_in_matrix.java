package Questions.Matrix;

import java.util.Arrays;

 class binary_search_in_matrix {
    public static void main(String[] args) {
        int [][] matrix = {
                            {10, 20, 30, 40},
                            {15, 25, 35, 45},
                            {28, 29, 37, 49},
                            {33, 34, 38, 50}
                          };
        int [] ans = binary_search(matrix, 39);
        System.out.println("Element found at: " + Arrays.toString(ans));
    }

    public static int [] binary_search(int [][] mat, int target){
        int row = 0, col = mat.length - 1;
        while(row < mat.length && col >= 0){
            if(mat[row][col] == target){
                return new int[]{row,col};
            }
            else if(mat[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
