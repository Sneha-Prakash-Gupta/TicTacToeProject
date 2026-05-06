import java.util.Scanner;

/**
 * TicTacToe
 * UC3 reads a slot number (1-9) entered by the user.
 * Focus: input handling only (no validation yet)
 */
public class TicTacToe_UC3 {

    public static void main(String[] args) {

        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);

    }

    /**
     * Reads an integer slot value from the user.
     * Output: Slot number (1-9)
     */
    static int getUserSlot() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter slot (1-9): ");
        int slot = sc.nextInt();

        return slot;
    }
}