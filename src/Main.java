import java.awt.*;

public class Main {
    public static void main(String[] args)
    {
        // Variable set up.
        Dimension screenSize; // Size of the users screen.
        final float widthReductionValue = 2; // Screen size will be divided by this value to get gameSize.
        final float heightReductionValue = 1.5f; // Screen size will be divided by this value to get gameSize.
        Dimension gameSize = new Dimension();   // Size of the game screen.
        Point gameLocation = new Point(); // Location on the screen where the game is located.

        // Grab system screen size to properly size the game.
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Set up the game size.
        int newWidth = (int) (screenSize.getWidth() / widthReductionValue);
        int newHeight = (int) (screenSize.getHeight() / heightReductionValue);
        gameSize.setSize(newWidth,newHeight);

        // Set up the game position to center it to screen.
        int newXLocation = (int) ((screenSize.getWidth()/2) - (gameSize.getWidth()/2));
        int newYLocation = (int) ((screenSize.getHeight()/2) - (gameSize.getHeight()/2));
        gameLocation.setLocation(newXLocation,newYLocation);

        // Set up the main start screen.
        StartupScreen screen = new StartupScreen(gameSize,gameLocation);
        screen.Show();
    }
}