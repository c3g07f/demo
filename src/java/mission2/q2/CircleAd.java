package src.java.mission2.q2;

class CircleAd extends Ad {
    public double radius;
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public CircleAd() {
    }
    public double getArea(double num1) {
        return Math.PI * num1 * num1;
    }
    public double getBorderLength(double num1) {
        return Math.PI * 2 * num1;
    }

}
