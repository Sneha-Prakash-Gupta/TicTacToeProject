public class TicTacToe_UC4 {

    public static void main(String[] args) {
        int slot = 7; // Example input

        System.out.println("Row: " + getRowFromSlot(slot));
        System.out.println("Column: " + getColFromSlot(slot));
    }

    /**
     * Converts slot (1-9) to row index (0-2)
     * Formula: (slot - 1) / 3
     */
    public static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    /**
     * Converts slot (1-9) to column index (0-2)
     * Formula: (slot - 1) % 3
     */
    public static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}