import java.awt.*;

public class ExDrawLine {
    public static void main(String[] args) {

        DrawingPanel panel = new DrawingPanel(800,400);
        Graphics g = panel.getGraphics();

        g.drawLine(25, 75, 175, 25);
    }
}
