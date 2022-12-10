/*
    This class will handle all the "Main Menu" Dialog options.
 */
import javax.swing.*;
import java.awt.*;

public class StartupScreen
{
    // Private Member Variables.
    private JDialog m_startScreenDialog = new JDialog();
    private Dimension m_startScreenSize = new Dimension();
    private Point m_startScreenPosition = new Point();

    // Getters and Setters
    public void setStartScreenSize(Dimension size)
    {
        m_startScreenSize.setSize(size);
    }
    public Dimension getStartScreenSize()
    {
        return m_startScreenSize.getSize();
    }
    public void setStartScreenPosition(Point size)
    {
        m_startScreenPosition.setLocation(size);
    }
    public Point getStartScreenPosition()
    {
        return m_startScreenPosition.getLocation();
    }

    StartupScreen(Dimension startScreenSize, Point startScreenPosition)
    {
        // Set the member variables.
        setStartScreenSize(startScreenSize);
        setStartScreenPosition(startScreenPosition);

        // Set up the dialog.
        m_startScreenDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        m_startScreenDialog.setSize(getStartScreenSize());
        m_startScreenDialog.setLocation(getStartScreenPosition());
    }

    public void Show()
    {
        m_startScreenDialog.setVisible(true);
    }
}
