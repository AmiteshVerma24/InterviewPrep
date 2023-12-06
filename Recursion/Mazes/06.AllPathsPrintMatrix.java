package Recursion.Mazes;
import java.util.Arrays;

class AllPathsPrintMatrix {
    public static void main(String[] args) {
        boolean [][] board = {
                             {true, true, true},
                             {true, true, true},
                             {true, true, true},
                             {true, true, true},
                            };
        int [][] path_array = new int[board.length][board[0].length];
        find_paths(board, 0, 0, "", path_array, 1);
    }
    public static void find_paths(boolean [][] maze, int row, int col, String current_path, int[][] path_array, int path_number){
        // We have reached the destination
        if(row == maze.length - 1 && col == maze.length - 1){
            System.out.println(current_path);
            path_array[row][col] = path_number;
            for (int[] inner : path_array) {
                System.out.println(Arrays.toString(inner));
            }
            return;
        }
        // Already visited
        if(maze[row][col] == false) return;
        // Mark the current as visited i.e we are including it into our path
        maze[row][col] = false;
        path_array[row][col] = path_number;

        // Move down
        if(row < maze.length - 1){
            find_paths(maze, row + 1, col, current_path + "D", path_array, path_number + 1);
        }
        // Mode right
        if(col < maze.length - 1){
            find_paths(maze, row, col + 1, current_path + "R", path_array, path_number + 1);
        }
        // Move up
        if(row > 0){
            find_paths(maze, row - 1, col, current_path + "U", path_array, path_number + 1);
        }
        // Move left
        if(col > 0){
            find_paths(maze, row, col - 1, current_path + "L", path_array, path_number + 1);
        }

        maze[row][col] = true;
        path_array[row][col] = 0;

    }
}
