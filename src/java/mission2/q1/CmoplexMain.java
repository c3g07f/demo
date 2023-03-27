package src.java.mission2.q1;

import java.util.Scanner;

public class CmoplexMain {
    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber();
        ComplexNumber complexNumber2 = new ComplexNumber();
//        String sum = complexNumber1.ComplexSum(complexNumber2);
//        String sub = complexNumber1.ComplexSub(complexNumber2);
//        String mult = complexNumber1.Complexmult(complexNumber2);
//        String div = complexNumber1.Complexdiv(complexNumber2);
//        System.out.println(sum);
//        System.out.println(sub);
//        System.out.println(mult);
//        System.out.println(div);
        int x = 0;
        double a = 0,b = 0,c = 0,d = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1.复数加法");
            System.out.println("2.复数减法");
            System.out.println("3.复数乘法");
            System.out.println("4.复数除法");
            System.out.println("---------------------------------");
            System.out.println("输入第一个复数的实部虚部:");
            a= scanner.nextInt();
            b= scanner.nextInt();
            complexNumber1.setA(a);
            complexNumber1.setB(b);
            System.out.println("输入第二个复数的实部虚部:");
            c= scanner.nextInt();
            d= scanner.nextInt();
            complexNumber2.setA(c);
            complexNumber2.setB(d);
            System.out.println("选择计算方式:");
            x = scanner.nextInt();
            switch (x){
                case 1:
                    String sum = complexNumber1.ComplexSum(complexNumber2);
                    System.out.println(sum);
                    break;
                case 2:
                    String sub = complexNumber1.ComplexSub(complexNumber2);
                    System.out.println(sub);    //后输入减去先输入
                    break;
                case 3:
                    String mult = complexNumber1.Complexmult(complexNumber2);
                    System.out.println(mult);
                    break;
                case 4:
                    String div = complexNumber1.Complexdiv(complexNumber2);
                    System.out.println(div);    //后输入除以先输入
                default:break;
            }
        }
    }
}
