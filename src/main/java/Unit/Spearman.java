package Unit;
public class Spearman extends Warrior {


    public Spearman(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed) {
        super(name, hp, maxHp, attack, damage, protection, speed);
    }

    public Spearman(String name) {
        super(name, 100, 100, 12, 13, 20, 50);


    }

    @Override
    public void getInfo() {
        System.out.printf("Я копейщик %s! hp: %d, attack: %d\n", Spearman.super.name, Spearman.super.hp, Spearman.super.attack);

    }

    //    убегает с поля (не функционирует 1-2 хода при критическом HP)
    public void runAway() {
    }
}
