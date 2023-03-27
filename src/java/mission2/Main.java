package src.java.mission2;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(4, 6);

        double distance = point1.distance(point2);
        System.out.println("The distance between the two points is: " + distance);
    }
}
