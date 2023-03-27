package src.daily.demo;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {

        int x = 0, sum = 0;
        Scanner scanner = new Scanner(System.in);
        /*100内逢7过*/
        for (int i = 0; i <= 100; i++) {
            if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
                continue;
            }
            System.out.println(i);
        }
    }
}
