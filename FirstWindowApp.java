class FirstWindowApp
{
    private static Window window;
    private static WindowPanel windowPanel;

    public static void main(String args[])
    {
        //windowPanel.setFocusable(true);
        //windowPanel.requestFocus();
        windowPanel = new WindowPanel();
        window = new Window(windowPanel);
        windowPanel.requestFocus();
    }
}