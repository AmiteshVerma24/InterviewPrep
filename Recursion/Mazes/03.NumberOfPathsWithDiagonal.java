package Recursion.Mazes;

class NumberOfPathsWithDiagonal {
    public static void main(String[] args) {
        int [][] maze = new int[3][3];
        diagonal_paths(maze, 0, 0, "");
    }
    public static void diagonal_paths(int [][] maze, int row, int col, String path_till_now){
        if(row == maze.length - 1 && col == maze.length - 1) {
            System.out.println(path_till_now);
            return;
        }
        if(row < maze.length){
            diagonal_paths(maze , row + 1, col, path_till_now + "Down ");
        }
        if (col < maze.length) {
            diagonal_paths(maze , row, col + 1, path_till_now + "Right ");
        }
        if(row < maze.length && col < maze.length){
            diagonal_paths(maze , row + 1, col + 1, path_till_now + "Diagonal ");
        }
        return;
    }
}
