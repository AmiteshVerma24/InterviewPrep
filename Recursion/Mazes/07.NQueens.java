package Recursion.Mazes;

class NQueens {
    public static void main(String[] args) {
        int n = 20;
        boolean[][] board = new boolean[n][n];
        System.out.println(nQueens(board, 0));
    }
    public static boolean isSafe(boolean[][] maze, int row, int col){
        // Check vertical
        for (int i = 0; i < row; i++) {
            if(maze[i][col] == true) return false;
        }
        // Check left side
        int maxLeft = Math.min(row, col);
        for(int i = 1 ; i <= maxLeft ; i++){
            if(maze[row - i][col - i] == true) return false;
        }
        // Check right side
        int maxRight = Math.min(row , maze.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(maze[row - i][col + i] == true) return false;
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public static int nQueens(boolean [][] maze , int row){
        // Print the board when we have reached the end
        if(row == maze.length){
            display(maze);
            System.out.println();
            return 1;
        }
        int count = 0;
        // Place the queen in col of the row and check if it is safe or not
        for(int col = 0 ; col < maze[0].length ; col++){
            if(isSafe(maze, row, col)){
                maze[row][col] = true;
                count += nQueens(maze, row + 1);
                maze[row][col] = false;
            }
        }
        return count;
    }
}
