import javax.swing.*;

public class App {
    public static void main(String[] args) {
        StartMenu.showStartMenu(); // Show Start Menu dulu
    }

    public static void startGame() {
        JFrame frame = new JFrame("Floppy Bird");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(360, 640);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}
