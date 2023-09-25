package Pattern;

/*
         1
        212
       32123
      4321234
       32123
        212
         1
*/

public class pattern17 {
    public static void main(String[] args) {
        print_pattern(7);
        
    }
    public static void print_pattern(int n){
            for(int row = 1 ; row <= n ; row++){
            int num_col = row <= 4 ? row : n - row + 1;
            int num_spaces = 4 - num_col;
            for(int space = 1 ; space <= num_spaces ; space++){
                System.out.print("  ");
            }
            for(int col = num_col ; col >= 1 ; col--){
                System.out.print(col+" ");
            }
            for(int col = 2 ; col <= num_col ; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
