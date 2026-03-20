class Solution {
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        // Step 1: Mark boundary-connected 'O' as 'T'
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if ((r == 0 || r == rows - 1 || c == 0 || c == cols - 1)
                        && board[r][c] == 'O') {
                    dfs(board, r, c);
                }
            }
        }
        // Step 2: Flip and restore
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (board[r][c] == 'O') {
                    board[r][c] = 'X'; // captured
                } else if (board[r][c] == 'T') {
                    board[r][c] = 'O'; // restore
                }
            }
        }
    }

    private void dfs(char[][] board, int r, int c) {
        int rows = board.length;
        int cols = board[0].length;
        if (r < 0 || r >= rows || c < 0 || c >= cols || board[r][c] != 'O') {
            return;
        }
        // Mark as safe
        board[r][c] = 'T';
        dfs(board, r + 1, c);
        dfs(board, r - 1, c);
        dfs(board, r, c + 1);
        dfs(board, r, c - 1);
    }
}