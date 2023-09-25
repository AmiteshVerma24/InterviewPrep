package Pattern;
/*
         *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *
 */
public class pattern28 {
    public static void main(String[] args) {
        for(int row = 1 ; row <= 9 ; row++){
            int col_max = row <= 5 ? row : 9 - row + 1;
            int num_space = 5 - col_max;
            for(int space = num_space ; space >= 0 ; space--){
                 System.out.print(" ");
            }
            for(int col = 1 ; col <= col_max ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
