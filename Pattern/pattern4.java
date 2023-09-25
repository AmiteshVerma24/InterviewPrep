package Pattern;
/*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
*/

public class pattern4 {
    public static void main(String[] args) {
        for(int row = 1 ; row <= 5 ; row++){
            for(int col = 1 ; col <= row ; col++){
                System.out.printf("%d ",col);
            }
            System.out.println();
        }
    }
}
