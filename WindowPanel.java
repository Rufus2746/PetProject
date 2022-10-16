import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class WindowPanel extends JPanel
{
    public WindowPanel() {
        addKeyListener(new KeyboardInputs());
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.fillRect(50, 50, 300, 300);

        //g.drawOval(200, 200, 40, 40);
        //g.drawOval(160, 200, 40, 40);
        //g.drawOval(180, 140, 40, 80);



    }
}
