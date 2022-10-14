class FirstWindowApp
{
    private static Window window;
    private static WindowPanel windowPanel;

    public static void main(String args[])
    {
        windowPanel = new WindowPanel();
        window = new Window(windowPanel);
    }
}