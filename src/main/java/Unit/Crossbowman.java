package Unit;

public class Crossbowman  extends Shooter {

    public Crossbowman(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed, Integer cartridges, Integer range) {
        super(name, hp, maxHp, attack, damage, protection, speed, cartridges, range);
    }

        public Crossbowman(String name) {
        super(name, 10, 100, 10, 10, 20, 5,10, 10);
    }
    @Override
    public void getInfo() {

        System.out.printf("Я арбалетчик %s! hp: %d, attack: %d\n", Crossbowman.super.name, Crossbowman.super.hp,Crossbowman.super.attack);

    }

    //    Атака дальнего боя (-HP и шанс заблокировать атаку противника на 1 ход)
    @Override
    public Integer getAttack() {
        return attack;
    }
}


