package Unit;

public class Crossbowman  extends Shooter {


    public Crossbowman(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage,
                       Integer protection, Integer speed, Integer posX, Integer posY, Integer cartridges, Integer range) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, speed, posX, posY, cartridges, range);
    }

            public Crossbowman(String name) {
        super(name, 30.0f, 100, 10, 10, 20, 5,9, 1,2, 10, 2);
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалет:  \t").append(Crossbowman.super.name)
                .append("\t HP: \t").append(Crossbowman.super.hp)
                .append("\t Speed: \t").append(Crossbowman.super.speed)
                .append("\t ATK: \t").append(Crossbowman.super.attack)
                .append("\t Arrows: ").append(Crossbowman.super.cartridges);
    }

    //    Атака дальнего боя (-HP и шанс заблокировать атаку противника на 1 ход)
    @Override
    public Integer getAttack() {
        return attack;
    }
}


