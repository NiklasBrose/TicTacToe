// src/GameRules.java
import javax.swing.JButton;

/**
 * Die Klasse GameRules überprüft den Spielstatus und bestimmt, ob ein Spieler gewonnen hat.
 *
 * @author Niklas Brose
 * @version 1.0
 */
public class GameRules {
    private JButton[][] buttons;

    /**
     * Konstruktor für die GameRules-Klasse.
     *
     * @param buttons Ein 2D-Array von JButtons, das das Spielfeld darstellt.
     */
    public GameRules(JButton[][] buttons) {
        this.buttons = buttons;
    }

    /**
     * Überprüft, ob ein Spieler gewonnen hat.
     *
     * @return true, wenn ein Spieler gewonnen hat, andernfalls false.
     */
    public boolean checkWin() {
        // Überprüfen Sie die Zeilen
        for (int i = 0; i < 3; i++) {
            if (checkLine(buttons[i][0], buttons[i][1], buttons[i][2])) {
                return true;
            }
        }

        // Überprüfen Sie die Spalten
        for (int i = 0; i < 3; i++) {
            if (checkLine(buttons[0][i], buttons[1][i], buttons[2][i])) {
                return true;
            }
        }

        // Überprüfen Sie die Diagonalen
        if (checkLine(buttons[0][0], buttons[1][1], buttons[2][2]) ||
                checkLine(buttons[0][2], buttons[1][1], buttons[2][0])) {
            return true;
        }

        return false;
    }

    /**
     * Überprüft, ob drei Buttons in einer Linie den gleichen Text haben.
     *
     * @param b1 Der erste Button.
     * @param b2 Der zweite Button.
     * @param b3 Der dritte Button.
     * @return true, wenn alle drei Buttons den gleichen Text haben und nicht leer sind, andernfalls false.
     */
    private boolean checkLine(JButton b1, JButton b2, JButton b3) {
        return !b1.getText().equals("") && b1.getText().equals(b2.getText()) && b2.getText().equals(b3.getText());
    }
}