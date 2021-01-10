import java.util.Scanner;

public class PointClient {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("mooDefault = (0, 0)");
        System.out.print("Enter x-value: ");
        int x = console.nextInt();
        System.out.print("Enter y-value: ");
        int y = console.nextInt();
        System.out.println("moo = (" + x + ", " + y + ")");

        Point moo = new Point(x,y);

        moo.translate(2, 2);
        moo.setXY(moo.getX(), 0);
        moo.translate(0,19);
        moo.setXY(moo.getY(), moo.getX());

        System.out.println(moo.toString());
        System.out.println("Quadrant: " + moo.getQuadrant());
        System.out.println("Distance to origin: " + moo.distanceToOrigin());

        Point other = new Point(137,4);
        System.out.println(other);
        System.out.println("slope = " + moo.slope(other));

    }
}