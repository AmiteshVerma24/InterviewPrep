package Recursion.Mazes;
// https://leetcode.com/problems/word-search/
class WordSearch {
    public static void main(String[] args) {
        char [][] arr = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        boolean [][] state = new boolean[arr.length][arr[0].length];
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                System.out.println(search(arr, "ABCB", state, 0 , 0, 0, ""));
            }
        }
    }
    public static boolean search(char[][] board, String word, boolean [][] state, int row, int col, int index, String str){
        if(str.equals(word)) return true;
        // Checking array index out of bound
        if(index >= word.length() || row < 0 || col < 0 || row >= board.length || col >= board[0].length){
            return false;
        }
        // Checking if the current cell aligns with the word index
        if(word.charAt(index) != board[row][col]) return false;
        // Check if already visited in that function call
        if(state[row][col] == true) return false;
        // Marking as visited
        state[row][col] = true;
        // Go right
        if(col < board[0].length - 1){
            search(board, word, state, row, col + 1, index + 1, str + board[row][col]);
        }
        // Go down
        if(row < board.length - 1){
            search(board, word, state, row + 1, col, index + 1, str + board[row][col]);
        }
        // Go left
        if(row > 0){
            search(board, word, state, row, col - 1, index + 1, str + board[row][col]);
        }
        // Go up
        if(col > 0){
            search(board, word, state, row - 1, col, index + 1, str + board[row][col]);
        }
        // Backtrack
        state[row][col] = false;
        return true;
    }
}
