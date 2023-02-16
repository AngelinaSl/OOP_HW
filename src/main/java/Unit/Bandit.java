package Unit;

public class Bandit extends Warrior {
    int disguise;




    public Bandit(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed, int disguise) {
        super(name, hp, maxHp, attack, damage, protection, speed);
        this.disguise = disguise;
    }

    public Bandit(String name) {
        super(name, 100, 100, 5, 8, 5, 50);
        this.disguise = 10;

    }
    @Override
    public void getInfo() {
        System.out.printf("Я бандит %s! hp: %d, attack: %d\n", Bandit.super.name, Bandit.super.hp,Bandit.super.attack);

    }

//    Своровать
    public void steal(int disguise, Shooter Shooter) {
    }

}
