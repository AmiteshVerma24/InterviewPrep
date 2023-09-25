package Pattern;
/*
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
*/

public class pattern5 {
    public static void main(String[] args) {
        for(int row = 1 ; row <= 9 ; row++){
            if(row <= 5){
                for(int col = 1 ; col <= row ; col++){
                    System.out.printf("*");
                }
            }else{
                for(int col = 1 ; col <= 9 - row + 1 ; col++){
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
        
    }
    
}
