// src/MyFrame.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Die Klasse MyFrame erstellt ein Fenster mit einem 3x3-Raster von Buttons.
 * Die Buttons wechseln zwischen "X" und "O" bei jedem Klick und überprüfen den Spielstatus.
 *
 * @author Niklas Brose
 * @version 1.0
 */
public class MyFrame extends JFrame {
    private boolean isXTurn = true; // Variable, um den aktuellen Zustand zu verfolgen
    private JButton[][] buttons = new JButton[3][3]; // 2D-Array für die Buttons
    private GameRules gameRules;

    /**
     * Konstruktor für die MyFrame-Klasse.
     * Initialisiert das Fenster und das Spielfeld.
     */
    public MyFrame() {
        setTitle("TicTacToe"); // Setzt den Titel des Fensters
        setSize(500, 500); // Setzt die Größe des Fensters auf 500x500 Pixel
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Beendet das Programm beim Schließen des Fensters
        setLayout(new BorderLayout()); // Setzt das Layout des Frames auf BorderLayout

        // Erzeugt ein JPanel mit einem 3x3 GridLayout
        JPanel panel = new JPanel(new GridLayout(3, 3));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton(""); // Erzeugt einen neuen Button
                buttons[i][j].addActionListener(new ButtonClickListener());
                panel.add(buttons[i][j]); // Fügt den Button dem Panel hinzu
            }
        }

        gameRules = new GameRules(buttons); // Initialisiert die GameRules-Klasse

        add(panel, BorderLayout.CENTER); // Fügt das Panel in die Mitte des Frames ein
        setVisible(true); // Macht das Fenster sichtbar
    } // MyFrame()

    /**
     * Die Klasse ButtonClickListener behandelt die Klick-Ereignisse der Buttons.
     */
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            if (button.getText().equals("")) { // Überprüft, ob der Button leer ist
                button.setText(isXTurn ? "X" : "O"); // Setzt den Text des Buttons auf "X" oder "O"
                isXTurn = !isXTurn; // Wechselt den Zustand
                if (gameRules.checkWin()) {
                    JOptionPane.showMessageDialog(null, "Spieler " + (isXTurn ? "O" : "X") + " gewinnt!");
                    resetGame();
                }
            }
        }
    }

    /**
     * Setzt das Spielfeld zurück, indem alle Buttons geleert werden.
     */
    private void resetGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
            }
        }
        isXTurn = true;
    }

}