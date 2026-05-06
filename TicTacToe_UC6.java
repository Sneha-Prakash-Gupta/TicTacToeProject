/**
 * TicTacToe
 * UC6 places a player's symbol on the board at the given position.
 * Focus: updating game state.
 */
public class TicTacToe_UC6 {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        placeMove(0, 0, 'X');
        System.out.println(board[0][0]); // should print X
    }

    /**
     * Places symbol on board at given row and column
     */
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}