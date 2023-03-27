package src.java.mission2.q2;
//2、设计一个广告牌管理系统，包含广告类Ad和两个子类RectangleAd和CircleAd。Ad类包含属性clothPrice和borderPrice，
//        分别表示每平方米广告布的造价和每米封边的造价。RectangleAd类包含属性width和height，表示广告牌的长和宽，
//        还包含getArea()方法和getBorderLength()方法。CircleAd类包含属性radius，表示广告牌的半径，
//        还包含getArea()方法和getBorderLength()方法。在主程序中分别新建一个圆形广告牌和一个矩形广告牌，
//        并且输出他们最终的造价。（广告牌每平方米造价为10元，每米封边造价为5元）*/

 class Ad {
     private double clothPice
             ;
     private double borderPrice;

     public void setClothPice(double clothPice) {
         this.clothPice = clothPice;
     }

     public void setBorderPrice(double borderPrice) {
         this.borderPrice = borderPrice;
     }

     public double getClothPice() {
         return clothPice;
     }
     public double getBorderPrice() {
         return borderPrice;
     }
 }


