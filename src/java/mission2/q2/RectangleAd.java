package src.java.mission2.q2;

class RectangleAd extends Ad {
    private double width;
    private double height;
    public RectangleAd() {
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public RectangleAd(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(double num1, double num2) {
        return num1 * num2;
    }
    public double getBorderLength(double num1, double num2) {
        return (num1 + num2) * 2;
    }
}
