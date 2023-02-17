package Unit;
public class Spearman extends Warrior {
    public Spearman(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage, Integer protection, Integer speed, Integer posX, Integer posY) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, speed, posX, posY);
    }

    public Spearman(String name) {
        super(name, 15.0f, 20, 4, 1, 3, 5, 4, 2,2);


    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик: \t").append(Spearman.super.name)
                .append("\t HP: \t").append(Spearman.super.hp)
                .append("\t Speed: \t").append(Spearman.super.speed)
                .append("\t ATK: \t").append(Spearman.super.attack);
    }


}
