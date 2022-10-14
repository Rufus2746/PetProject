import javax.swing.JPanel;

import java.awt.Graphics;

public class WindowPanel extends JPanel
{
    public WindowPanel()
    {
        //JPanel jpanel = new JPanel();

    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.drawRect(50, 50, 300, 300);
    }
}
