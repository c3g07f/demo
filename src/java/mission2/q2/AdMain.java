package src.java.mission2.q2;

public class AdMain {
    public static void main(String[] args) {
        Ad ad = new Ad();
        ad.setClothPice(10);
        ad.setBorderPrice(5);
        RectangleAd rectangleAd = new RectangleAd();
        rectangleAd.setHeight(8);
        rectangleAd.setWidth(10);
        CircleAd circleAd = new CircleAd();
        circleAd.setRadius(5);
        double rPrice = rectangleAd.getArea(rectangleAd.getWidth(), rectangleAd.getHeight()) * ad.getClothPice() + rectangleAd.getBorderLength(rectangleAd.getWidth(), rectangleAd.getHeight()) * ad.getBorderPrice();
        double cPrice = circleAd.getArea(circleAd.getRadius()) * ad.getClothPice() + circleAd.getBorderLength(circleAd.getRadius()) * ad.getBorderPrice();
        System.out.println(rPrice);
//        System.out.println(String.format("%.2f",cPrice));
        System.out.printf("%.2f%n",cPrice);
    }
}

