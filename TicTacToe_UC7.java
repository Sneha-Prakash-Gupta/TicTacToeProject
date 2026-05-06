import java.util.Random;

/**
 * TicTacToe
 * UC7 allows the computer to make a random valid move
 * by reusing slot conversion and validation logic.
 */
public class TicTacToe_UC7 {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static char computerSymbol = 'O';
    static Random rand = new Random();

    public static void main(String[] args) {
        computerMove();

        // show result (for testing)
        printBoard();
    }

    static void computerMove() {

        int row, col;
        int slot;

        // keep trying until valid move is found
        while (true) {

            slot = rand.nextInt(9) + 1;

            row = getRowFromSlot(slot);
            col = getColFromSlot(slot);

            if (isValidMove(row, col)) {
                board[row][col] = computerSymbol;
                System.out.println("Computer placed at slot: " + slot);
                break;
            }
        }
    }

    // UC4 logic reused
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }

    // UC5 logic reused
    static boolean isValidMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) return false;
        return board[row][col] == '-';
    }

    static void printBoard() {
        System.out.println("Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}