package src.daily.demo;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(getSum(x,y));
    }
    public static void add(int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);
    }
    public static int getSum(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
}
