import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartMenu {
    private JPanel mainPanel;
    private JButton startGameButton;
    private JLabel Title;

    public StartMenu() {
        // === STYLING START ===

        mainPanel.setBackground(new Color(135, 206, 250)); // Sky blue

        Title.setText("Floppy Bird");
        Title.setFont(new Font("Arial Black", Font.BOLD, 40));
        Title.setForeground(Color.RED);
        Title.setHorizontalAlignment(SwingConstants.CENTER);

        startGameButton.setText("Start Game");
        startGameButton.setBackground(new Color(255, 215, 0)); // Gold
        startGameButton.setForeground(Color.WHITE);
        startGameButton.setFont(new Font("Arial", Font.BOLD, 24));
        startGameButton.setFocusPainted(false);
        startGameButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Tutup window start menu
                SwingUtilities.getWindowAncestor(mainPanel).dispose();

                // Buka window game Flappy Bird
                JFrame gameFrame = new JFrame("Floppy Bird");
                gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gameFrame.setSize(360, 640);
                gameFrame.setLocationRelativeTo(null);
                gameFrame.setResizable(false);

                FlappyBird flappyBird = new FlappyBird();
                gameFrame.add(flappyBird);
                gameFrame.pack();
                flappyBird.requestFocus();
                gameFrame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Floppy Bird Start Menu");
        frame.setContentPane(new StartMenu().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(360, 640); // Ukuran sama kayak game
        frame.setLocationRelativeTo(null); // Tengah layar
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static void showStartMenu() {
        JFrame frame = new JFrame("Flappy Bird Start Menu");
        frame.setContentPane(new StartMenu().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(360, 640); // Sama kayak ukuran game
        frame.setLocationRelativeTo(null); // Center screen
        frame.setResizable(false);
        frame.setVisible(true);
    }

}
