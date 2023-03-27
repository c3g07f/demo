package src.test.java.mission1;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args){
//        int x = 0,y = 0,max = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入第一个数：");
//        x = scanner.nextInt();
//        System.out.println("请输入第二个数：");
//        y = scanner.nextInt();
//        if  (x == y){
//            System.out.println("两数相同！");
//        }
//        else {
//            max = (x >y) ?x:y;  //三元运算符 a>b?a:b
//            System.out.println("两数最大为："+max);
        int x = 0,y = 0,z = 0 ,max = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        x = scanner.nextInt();
        System.out.println("请输入第二个数：");
        y = scanner.nextInt();
        System.out.println("请输入第三个数：");
        z = scanner.nextInt();

        if  (x == y & y== z){
            System.out.println("三数相同！");
        }
        else {
            max = (x>y?x:y)>z?(x>y?x:y):z; //三元运算符 a>b?a:b
            System.out.println("三数最大为："+max);




        }
    }
}
