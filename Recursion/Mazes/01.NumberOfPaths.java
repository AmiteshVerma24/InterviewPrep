package Recursion.Mazes;
// Given mxm matrix find number of ways to reach from (0,0) to (m-1,m-1)
class NumberOfPaths {
    public static void main(String[] args) {
        int [][] maze = new int[4][4];
        System.out.println(find_ways(maze, 0, 0));
    }
    public static int find_ways(int [][] maze, int row, int col){
        // If I reach any end of maze
        if(row == 2 || col == 2) return 1;
        // Call on left and then on right
        int number_of_left_ways = find_ways(maze, row + 1, col);
        int number_of_right_ways = find_ways(maze, row, col + 1);
        // Return the sum of ways
        return number_of_left_ways + number_of_right_ways;
    }

}
