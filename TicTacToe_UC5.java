/**
 * TicTacToe
 * UC5 validates whether a move is inside the board boundaries
 * and whether the selected cell is empty.
 */
public class TicTacToe_UC5 {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {

        System.out.println(isValidMove(1, 1)); // test case
    }

    /**
     * Validates move:
     * 1. Row and column must be within 0–2
     * 2. Cell must be empty ('-')
     */
    public static boolean isValidMove(int row, int col) {

        // Boundary check
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Cell empty check
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}