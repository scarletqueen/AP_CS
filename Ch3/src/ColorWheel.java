
import java.awt.*;

public class ColorWheel{
    public static int START_ANGLE = 0; // this is where the color wheel will start : want to make it zero so it goes full 360
    public static int ARC_ANGLE = 1; // this is how long each spoke is going to be : 1 creates the smoothest color wheel

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(512,512);
        Graphics g = panel.getGraphics();

        for (START_ANGLE = 0; START_ANGLE <= 360; START_ANGLE += ARC_ANGLE) { // how large each spoke is
            for(int i = 150; i >= 0; i --) {  // the saturation of the  spoke, whitest at the center and builds up from there
                g.setColor(Color.getHSBColor(START_ANGLE / 360.0f, i / 150f, 1));
                g.fillArc(256 - i, 256 - i , 2 * i , 2 * i , START_ANGLE,  ARC_ANGLE + 1);
            }
        }

    }
}
