package Unit;

public abstract class Warrior extends Human{


    public Warrior(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage, Integer protection, Integer speed, Integer posX, Integer posY) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, speed, posX, posY);
    }

    @Override
    public void step() {

    }

    //    Атака ближнего боя
    @Override
    public Integer getAttack() {
        return attack;
    }

    }

