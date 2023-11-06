package Recursion.Pattern;

class Triangle {
    public static void main(String[] args) {
        triangle_without_loop(4, 0);
    }
    public static void triangle(int num){
        if(num < 1) return;
        int counter = num;
        while(counter > 0){
            System.out.print("* ");
            counter--;
        }
        System.out.println();
        triangle(num - 1);
    }
    public static void triangle_without_loop(int row, int col){
        if(row == 0) return;
        if(col >= row){ 
            System.out.println();
            triangle_without_loop(row - 1, 0);
        }
        else{
            System.out.print("* ");
            triangle_without_loop(row, col + 1);
        }
    }
}
