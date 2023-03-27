package src.java.mission2;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
//AB|=√（x1-x2）²+(y1-y2)²;
    public double distance(Point other) {
        double deltaX = other.getX() - this.x;
        double deltaY = other.getY() - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}

