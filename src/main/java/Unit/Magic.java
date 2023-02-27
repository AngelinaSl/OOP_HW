package Unit;

import java.util.ArrayList;

public abstract class Magic extends Human {
    protected int mana;
    protected int maxMana;

    public Magic(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage, Integer protection, Integer speed, Integer posX, Integer posY) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, speed, posX, posY);
        this.mana = mana;
        this.maxMana = maxMana;

    }

    public int getMana() {return mana;}

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {

    }
}

