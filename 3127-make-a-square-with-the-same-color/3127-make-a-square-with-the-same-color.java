class Solution {
    public boolean canMakeSquare(char[][] grid) {
        char A = grid[0][0], B = grid[0][1], C = grid[0][2], D = grid[1][0], E = grid[1][1], F = grid[1][2],
                G = grid[2][0], H = grid[2][1], I = grid[2][2];
        if (E == 'W') {
            if ((A == 'W' && B == 'W') || (A == 'W' && D == 'W') || (B == 'W' && D == 'W'))
                return true;
            else if ((C == 'W' && B == 'W') || (C == 'W' && F == 'W') || (B == 'W' && F == 'W'))
                return true;
            else if ((G == 'W' && D == 'W') || (G == 'W' && H == 'W') || (D == 'W' && H == 'W'))
                return true;
            else if ((I == 'W' && F == 'W') || (I == 'W' && H == 'W') || (F == 'W' && H == 'W'))
                return true;
            else if ((A == 'B' && B == 'B' && D == 'B') || (B == 'B' && C == 'B' && F == 'B')
                    || (D == 'B' && G == 'B' && H == 'B') || (F == 'B' && H == 'B' && I == 'B'))
                return true;
        } else {
            if ((A == 'B' && B == 'B') || (A == 'B' && D == 'B') || (B == 'B' && D == 'B'))
                return true;
            else if ((C == 'B' && B == 'B') || (C == 'B' && F == 'B') || (B == 'B' && F == 'B'))
                return true;
            else if ((G == 'B' && D == 'B') || (G == 'B' && H == 'B') || (D == 'B' && H == 'B'))
                return true;
            else if ((I == 'B' && F == 'B') || (I == 'B' && H == 'B') || (F == 'B' && H == 'B'))
                return true;
            else if ((A == 'W' && B == 'W' && D == 'W') || (B == 'W' && C == 'W' && F == 'W')
                    || (D == 'W' && G == 'W' && H == 'W') || (F == 'W' && H == 'W' && I == 'W'))
                return true;
        }
        return false;
    }
}