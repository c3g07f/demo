package src.daily.demo;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array =new int [10];
        int sum = 0;
        /*十个0-100之间的数存入数组*/
        for (int i = 0;i  < 10;i++){
            array[i] = random.nextInt(100) + 1;
        }
        for (int i = 0;i <10;i++){
            sum = sum + array[i];
            System.out.print(array[i]);
            System.out.println("");
        }
        System.out.println(sum/ array.length);


    }
}
