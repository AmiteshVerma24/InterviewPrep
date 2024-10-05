package Recursion.Mazes;
// https://leetcode.com/problems/path-with-maximum-gold/

import java.util.Arrays;

class MaxGoldPath {
    public static void main(String[] args) {
        int [][] grid = {
            {1,0,7,0,0,0},
            {2,0,6,0,1,0},
            {3,5,6,7,4,2},
            {4,3,1,0,2,0},
            {3,0,5,0,20,0}
        };
        System.out.println(getMaximumGold(grid));
    }

    public static int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                if(grid[i][j] != 0) {
                    int currentGold = findPath(grid,i,j);
                    max = Math.max(currentGold, max);
                }
            }
        }
        return max;
    }
    public static int findPath(int [][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0) {
            return 0;
        }
        int current = grid[row][col];
        grid[row][col] = 0;
        int down = findPath(grid, row + 1, col);
        int up = findPath(grid, row - 1, col);
        int left = findPath(grid, row, col - 1);
        int right = findPath(grid, row, col + 1);
        grid[row][col] = current;
        return current + Math.max(Math.max(left,right),Math.max(up,down));
    }
}
