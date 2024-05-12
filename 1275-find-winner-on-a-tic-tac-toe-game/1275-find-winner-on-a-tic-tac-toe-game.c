char* tictactoe(int** moves, int movesSize, int* movesColSize) {
    char grid[3][3];
    char currentPlayer = 'X';
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            grid[i][j] = ' ';
        }
    }
    for (int i = 0; i < movesSize; i++) {
        int row = moves[i][0];
        int col = moves[i][1];

        grid[row][col] = currentPlayer;

        if ((grid[row][0] == currentPlayer && grid[row][1] == currentPlayer && grid[row][2] == currentPlayer) ||
            (grid[0][col] == currentPlayer && grid[1][col] == currentPlayer && grid[2][col] == currentPlayer) ||
            (row == col && grid[0][0] == currentPlayer && grid[1][1] == currentPlayer && grid[2][2] == currentPlayer) ||
            (row + col == 2 && grid[0][2] == currentPlayer && grid[1][1] == currentPlayer && grid[2][0] == currentPlayer)) {
            return currentPlayer == 'X' ? "A" : "B";
        }

        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    if (movesSize == 9) {
        return "Draw";
    } else {
        return "Pending";
    }
}