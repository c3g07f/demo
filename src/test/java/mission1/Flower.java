package src.test.java.mission1;
public class Flower {
    //水仙花数是指一个 3 位数，它的每个位上的数字的 3次幂之和等于它本身（例如：1^3 + 5^3+ 3^3 = 153）
    public static void main(String[] args){
         int x , y, z,a,b , flower = 100;
         for (flower = 100;flower < 100000;flower++){
            if (flower < 1000) {
                x = flower / 100;
                y = (flower / 10) % 10;   //取各位数
                z = flower % 10;
                if (flower == Math.pow(x, 3) + Math.pow(y, 3) + Math.pow(z, 3)) {      //Math.pow
                    System.out.println(flower);
                }
            }
            if (flower >= 1000 && flower <10000) {
                x = flower / 1000;
                y = (flower / 100) % 10;
                z = (flower / 10) % 10;
                a = flower % 10;
                if (flower == Math.pow(x, 4) + Math.pow(y, 4) + Math.pow(z, 4) +Math.pow(a, 4) ) {      //Math.pow
                    System.out.println(flower);
                         }
           }
             if (flower >=10000) {
                 x = flower / 10000;
                 y = (flower / 1000) % 10;
                 z = (flower / 100) % 10;
                 a = (flower / 10) % 10;
                 b = flower % 10;
                 if (flower == Math.pow(x, 5) + Math.pow(y, 5) + Math.pow(z, 5) +Math.pow(a, 5) + Math.pow(b, 5) ) {      //Math.pow
                     System.out.println(flower);
                 }
             }



         }




    }
}
