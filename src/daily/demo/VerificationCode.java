package src.daily.demo;

import java.util.Random;

public class VerificationCode {
    public static void main(String[] args) {
        char[] alphabet = new char[52];
        int[] num = new int[10];
        Random random = new Random();
        for (int i = 0;i <= alphabet.length - 1;i++){
            if (i <= 25){
                alphabet [i] = (char)(97 + i);
            }
            else {
                alphabet [i] = (char)(65 + i - 26);
            }
        }
        String result = "";
        for (int i = 0;i < 4;i++){
            int randomIndex = random.nextInt(alphabet.length);
            result += alphabet[randomIndex] ;
        }
        System.out.println(result + random.nextInt(10));
    }
}














































