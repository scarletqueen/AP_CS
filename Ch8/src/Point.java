public class Point {
    int x;
    int y;

    public Point(int initialX, int initialY ) {
        x = initialX;
        y = initialY;
    }

    public Point() {
        x = 0;
        y= 0;
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setXY(int setX, int setY) {
        x = setX;
        y = setY;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public int getQuadrant() {
        x = this.getX();
        y = this.getY();
        int quadrant = 0;
        if (x > 0 && y > 0) {
            quadrant += 1;
        } else if (x < 0 && y > 0) {
            quadrant += 2;
        } else if (x < 0  && y < 0) {
            quadrant += 3;
        } else if (x > 0 && y < 0) {
            quadrant += 4;
        }
        return quadrant;
    }

    public double distanceToOrigin() {
        x = this.getX();
        y = this.getY();
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return distance;
    }

    //
    public double slope(Point Other) {
        double slope;
        slope = (double) (this.getY() - Other.getY()) /( this.getX() - Other.getX());
        return slope;
    }
}
