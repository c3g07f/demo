package src.fightgame;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole("李淳罡", 50,15);
        GameRole gameRole2 = new GameRole("白狐儿脸", 30,30);
        while (true) {
            gameRole.attack(gameRole2);
            if (gameRole2.getBlood() == 0) {
                System.out.println(gameRole2.getName() + "Died!!!");
                break;
            }
            gameRole2.attack(gameRole);
            if (gameRole.getBlood() == 0) {
                System.out.println(gameRole.getName() + "Died!!!");
                break;
            }
        }
    }
}