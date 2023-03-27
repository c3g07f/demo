package src.daily.demo;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入开始数："); //10 - 50 之间
            int a = scanner.nextInt();
            System.out.println("请输入结束数：");
            int b = scanner.nextInt();
            int x = r.nextInt(b - a + 1);   //

            int result = x + a;
            System.out.println(result);
        }


    }
}
