package Unit;

public class Bandit extends Warrior {
    int disguise;

    public Bandit(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage, Integer protection, Integer speed, Integer posX, Integer posY, Integer disguise) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, speed, posX, posY);
        this.disguise = disguise;
    }

    public Bandit(String name) {
        super(name, 15.0f, 30, 8, 2, 4, 3, 6, 1,2);
        this.disguise = 10;

    }


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Фермер: \t").append(Bandit.super.name)
                .append("\t HP: \t").append(Bandit.super.hp)
                .append("\t Speed: \t").append(Bandit.super.speed)
                .append("\t ATK: \t").append(Bandit.super.attack);
    }


    public int getDisguise() {return disguise;}

    public void setDisguise(int disguise) {
        this.disguise = disguise;
    }

    @Override
    public void step() {

    }
}
