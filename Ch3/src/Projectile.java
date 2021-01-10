
import java.util.Scanner;
import java.awt.*;

public class Projectile {
    public static final double ACCELERATION = -9.81;
    public static final double INITIAL_VELOCITY = 30;
    public static final int TOTAL_POINTS = 100;

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(1000, 600);
        Scanner console = new Scanner(System.in);

        System.out.println("Please enter the start angle in degrees:    ");
        double startAngle = console.nextDouble();

        System.out.println("Please enter the final angle in degrees:    ");
        double finalAngle = console.nextDouble();

        System.out.println("Please enter the step size in degrees:    ");
        int stepSize = console.nextInt();

        for (double i = startAngle; i <= finalAngle; i = i + stepSize) {
            double angle = Math.toRadians(i);

            double xVelocity = INITIAL_VELOCITY * Math.cos(angle);
            double yVelocity = INITIAL_VELOCITY * Math.sin(angle);
            double totalTime = -2.0 * yVelocity / ACCELERATION;
            double timeIncrement = totalTime / TOTAL_POINTS;
            double xIncrement = xVelocity * timeIncrement;

            double x = 0.0;
            double y = 0.0;
            double t = 0.0;

            for (int j = 1; j <= TOTAL_POINTS; j++) {
                t += timeIncrement;
                x += xIncrement;
                y = displacement(yVelocity, t, ACCELERATION);
                Graphics g = panel.getGraphics();
                g.fillOval((int) (x * 11), 600 - (int) (y * 11), 2, 2);
            }
        }
    }
    public static double displacement ( double v, double t, double a){
        return v * t + 0.5 * a * t * t;
    }

}