class Solution {
    public boolean exist(char[][] board, String word) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (word.charAt(0) != board[row][col]) continue; 
                if (backtrack(board, word, 0, row, col)) return true;
            }
        }
        return false;
    }
    private boolean backtrack(char[][] board, String word, int strIdx, int row, int col) {
        if (strIdx == word.length()) return true;
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) return false;
        if (board[row][col] != word.charAt(strIdx)) return false;

        char tmp = board[row][col];
        board[row][col] = '#'; // mark visited

        boolean found = backtrack(board, word, strIdx + 1, row - 1, col) ||
                        backtrack(board, word, strIdx + 1, row + 1, col) ||
                        backtrack(board, word, strIdx + 1, row, col - 1) ||
                        backtrack(board, word, strIdx + 1, row, col + 1);

        board[row][col] = tmp; // restore
        return found;
    }
}