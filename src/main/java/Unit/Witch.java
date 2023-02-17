package Unit;

public class Witch extends Magic {
    public Witch(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage, Integer protection, Integer speed, Integer posX, Integer posY) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, speed, posX, posY);
    }


    public Witch(String name) {
        super(name, 20.0f, 20, 17, -5, -5, 12, 8, 4,2);

    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Колдун:  \t").append(Witch.super.name)
                .append("\t HP: \t").append(Witch.super.hp)
                .append("\t Speed: \t").append(Witch.super.speed)
                .append("\t ATK: \t").append(Witch.super.attack)
                .append("\t MP: \t").append(Witch.super.mana);
    }




}
