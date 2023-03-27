package src.daily.demo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class test {
    public static void main(String [] args){

            double x1=1.126;
            System.out.println(String.format("%.2f",x1));
            DecimalFormat df = new DecimalFormat(".00");
            System.out.println(df.format(x1));
        }


//        int x = 0,sum = 0;
//        Scanner scanner = new Scanner(System.in);
//        /*100内逢7过*/
//        for(int i = 0;i <= 100;i++ ){
//            if(i % 7 == 0 || i % 10 == 7 || i / 10 == 7 ){
//                continue;
//            }
//            System.out.println(i);
//        }
//        double h = 8844430;int count = 0;     //折纸算珠峰！
//        double a = 0.1;double temp = 0;
//        while (a < h){
//            a = a * 2;
//            count++;
//        }
//        System.out.println(a);

        /*判断回文数*/
//        x = scanner.nextInt();
//        int temp = x;
//        while(temp > 0){
//            int ge = temp % 10; //取最后一位
//            temp = temp / 10; //去掉最后一位
//            sum = sum * 10 + ge;
//        }
//        System.out.println(sum);
//        if(sum == x){
//            System.out.println("该数是回文数："+sum);
//        }
//        else System.out.println(x + "不是回文数！");






//        for(int i = 0;i <= 100;i++){  //做累加
//            if(i % 2 == 0){
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);

//        while (true){
//            System.out.println("请输入今天是周几：");
//            x = scanner.nextInt();
//            switch (x){
//                case 1:System.out.println("跑步");break;
//                case 2:System.out.println("游泳");break;
//                case 3:System.out.println("慢走");break;
//                case 4:System.out.println("动感单车"); break;
//                case 5:System.out.println("拳击"); break;
//                case 6:System.out.println("爬山"); break;
//                case 7:System.out.println("好好吃一顿"); break;
//                default:System.out.println("Out of the range!");break;
//            }
//        }
//        switch (x){
//            case 1:System.out.println("跑步");break;
//            case 2:System.out.println("游泳");break;
//            case 3:System.out.println("慢走");break;
//            case 4:System.out.println("动感单车"); break;
//            case 5:System.out.println("拳击"); break;
//            case 6:System.out.println("爬山"); break;
//            case 7:System.out.println("好好吃一顿"); break;
//            default:System.out.println("Out of the range!");break;
//        }
    }

