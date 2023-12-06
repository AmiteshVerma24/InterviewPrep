package Recursion.Mazes;

class AllPathsIncluded {
    public static void main(String[] args) {
        boolean [][] maze = {
                             {true, true, true},
                             {true, true, true},
                             {true, true, true}
                            };
        find_paths(maze, 0, 0, "");
    }
    public static void find_paths(boolean [][] maze, int row, int col, String current_path){
        // We have reached the destination
        if(row == maze.length - 1 && col == maze.length - 1){
            System.out.println(current_path);
            return;
        }
        // Already visited
        if(maze[row][col] == false) return;
        // Mark the current as visited i.e we are including it into our path
        maze[row][col] = false;

        // Move down
        if(row < maze.length - 1){
            find_paths(maze, row + 1, col, current_path + "D");
        }
        // Mode right
        if(col < maze.length - 1){
            find_paths(maze, row, col + 1, current_path + "R");
        }
        // Move up
        if(row > 0){
            find_paths(maze, row - 1, col, current_path + "U");
        }
        // Move left
        if(col > 0){
            find_paths(maze, row, col - 1, current_path + "L");
        }

        maze[row][col] = true;

    }
}
