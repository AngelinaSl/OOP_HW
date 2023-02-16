package Unit;

public class Witch extends Supernatural{

    public Witch(String name, Integer hp, Integer maxHp, Integer attack, Integer damage,
                 Integer protection, Integer speed, int mana, int maxMana) {
        super(name, hp, maxHp, attack, damage, protection, speed, mana, maxMana);
    }
    public Witch(String name) {
        super(name, 100, 100, 15, 35, 50, 40, 50, 50);

    }
    @Override
    public void getInfo() {
        System.out.printf("Я колдун %s! hp: %d, attack: %d\n", Witch.super.name, Witch.super.hp,Witch.super.attack);

    }

    //    Магическая атака
    @Override
    public Integer getAttack() {
        return attack;
    }

}
