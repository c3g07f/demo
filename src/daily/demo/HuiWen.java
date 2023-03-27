package src.daily.demo;

import java.util.Scanner;

public class HuiWen {

    public static void main(String[] args) {

        /*判断回文数*/
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int temp = x;
        while(temp > 0){
            int ge = temp % 10; //取最后一位
            temp = temp / 10; //去掉最后一位
            sum = sum * 10 + ge;
        }
        System.out.println(sum);
        if(sum == x){
            System.out.println("该数是回文数："+sum);
        }
        else System.out.println(x + "不是回文数！");
    }
}
