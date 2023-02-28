package Unit;

import java.util.ArrayList;

public class Bandit extends Warrior {
    int disguise;

    public Bandit(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage, Integer protection, Integer speed, Integer posX, Integer posY, Integer disguise) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, speed, posX, posY);
        this.disguise = disguise;
    }

    public Bandit(String name, Vector2D coords) {
        super(name, 15.0f, 20, 8, 2, 4, 3, 6, coords.posX, coords.posY);
        this.disguise = 10;

    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append(" Разбойник:\t").append(Bandit.super.name)
                .append("\t HP: \t").append(Bandit.super.hp);
    }

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {

    }
}
