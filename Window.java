import javax.swing.JFrame;

public class Window extends JFrame
{
    /*
    Or use
    privete JFrame jframe;
    using
    improt javax.swing.JFrame;
    out of class
    */
    public Window(WindowPanel windowPanel)
    {
       JFrame jframe = new JFrame();

       jframe.setSize(400, 400);
       jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jframe.add(windowPanel);
       


       jframe.setVisible(true);   //It needs to be at the bottom
    }
}
