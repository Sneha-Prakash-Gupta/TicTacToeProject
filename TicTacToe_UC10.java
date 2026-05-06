/**
 * TicTacToe
 * UC10 checks whether the game has ended in a draw
 * by ensuring no empty cells remain on the board.
 */
public class TicTacToe_UC10 {

    static char[][] board = {
        {'X', 'O', 'X'},
        {'O', 'X', 'O'},
        {'O', 'X', 'O'}
    };

    public static void main(String[] args) {
        System.out.println(isDraw());
    }

    /**
     * Returns true if no empty cells exist
     */
    static boolean isDraw() {

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {

                if (board[r][c] == '-') {
                    return false; // still moves left → not a draw
                }
            }
        }

        return true; // no empty cells → draw
    }
}