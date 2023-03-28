package src.fightgame;


import javax.management.relation.Role;
import java.util.Random;

/*血量，角色不同，在选人物时定下来*/
public  class GameRole {
    private String name;
    private double blood;
    private  int fight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBlood() {
        return blood;
    }

    public void setBlood(double blood) {
        this.blood = blood;
    }

    public int getFight() {
        return fight;
    }

    public void setFight(int fight) {
        this.fight = fight;
    }

    public GameRole(String name, double blood, int fight) {
        this.name = name;
        this.blood = blood;
        this.fight = fight;
    }

    public void attack(GameRole role){
        Random random = new Random();
        int attackDamage =  1 + random.nextInt(getFight());
        double  nowBlood = role.getBlood() - attackDamage;
        nowBlood = nowBlood < 0 ? 0 :nowBlood;
        role.setBlood(nowBlood);
        System.out.println(this.getName()+"使用普攻攻击了" + role.getName() + "\t" + role.getName() +"的血量减少" +attackDamage + "当前剩余" + nowBlood );
    };
}
