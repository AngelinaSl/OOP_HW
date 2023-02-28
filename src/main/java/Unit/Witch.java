package Unit;

public class Witch extends Magic {
    public Witch(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage, Integer protection, Integer speed, Integer posX, Integer posY) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, speed, posX, posY);
    }


    public Witch(String name, Vector2D coords) {
        super(name, 15.0f, 20, 17, -5, -8, 12, 8, coords.posX, coords.posY);
        mana = 15;

    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append(" Колдун:   \t").append(Witch.super.name)
                .append("\t HP: \t").append(Witch.super.hp)
                .append("\t State: ").append(Witch.super.state)
                .append("\t MP: \t").append(Witch.super.mana);
    }
}
