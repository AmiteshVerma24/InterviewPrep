package Recursion.Mazes;

class PrintThePaths {
    public static void main(String[] args) {
        int [][] maze = new int[3][3];
        find_ways(maze, 0, 0, "");
    }
    public static String find_ways(int [][] maze, int row, int col, String path_till_now){
        // Reach till the end
        if(row == maze.length - 1 && col == maze.length - 1){
            System.out.println(path_till_now);
            return path_till_now;
        }
        String path = "";
        if(row < maze.length){
            path += find_ways(maze, row+1, col, path_till_now + "D");
        }
        if(col < maze.length){
            path += find_ways(maze, row, col+1, path_till_now + "R");
        }
        return path;
    }
}
