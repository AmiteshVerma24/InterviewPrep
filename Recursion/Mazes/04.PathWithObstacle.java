package Recursion.Mazes;

class PathWithObstacle {
    public static void main(String[] args) {
        boolean [][] maze = {
                             {true, true, true},
                             {true, false, true},
                             {true, true, true}
                            };
        find_paths(maze, 0, 0, "");

    }
    public static void find_paths(boolean [][] maze, int row, int col, String path_till_now){
        if(row == maze.length - 1 && col == maze.length - 1){
            System.out.println(path_till_now);
        }
        if(row < maze.length && col < maze.length && maze[row][col] == false ) return;
        if(row < maze.length){
            find_paths(maze, row + 1, col, path_till_now + "D");
        }
        if(col < maze.length){
            find_paths(maze, row, col+1, path_till_now + "R");
        }
    }

}
