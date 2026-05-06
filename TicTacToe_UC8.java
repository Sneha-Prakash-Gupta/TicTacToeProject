/**
 * TicTacToe
 * UC8 controls the continuous game loop and alternates
 * turns until the game ends.
 */
public class TicTacToe_UC8 {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        int moves = 0; // simple draw tracking (max 9 moves)

        while (!gameOver && moves < 9) {

            if (isHumanTurn) {
                System.out.println("Human turn");
                // UC3 + UC4 + UC5 + UC6 would be used here
            } else {
                System.out.println("Computer turn");
                // UC7 would be used here
            }

            // simulate a move happening
            moves++;

            // toggle turn
            isHumanTurn = !isHumanTurn;

            // win/draw check placeholder
            if (moves == 9) {
                gameOver = true;
                System.out.println("Game Draw");
            }
        }

        System.out.println("Game Over");
    }
}