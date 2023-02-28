package Unit;

import java.util.ArrayList;

public class Monk extends Magic {

    int FreezeStep;
    public Monk(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage, Integer protection, Integer speed, Integer posX, Integer posY, int freezeStep) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, speed, posX, posY);
        this.FreezeStep = freezeStep;

    }
    public Monk(String name, Vector2D coords) {
        super(name, 15.0f, 20, 12, -4, -6, 7, 5, coords.posX, coords.posY);
        this.FreezeStep = 7;
        mana = 10;
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append(" Монах:   \t").append(Monk.super.name)
                .append("\t HP:  \t").append(Monk.super.hp)
                .append("\t State: ").append(Monk.super.state)
                .append("\t MP: \t").append(Monk.super.mana);

    }
}
