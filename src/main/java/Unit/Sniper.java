package Unit;

public class Sniper extends Shooter{
    public Sniper(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage,
                  Integer protection, Integer speed, Integer posX, Integer posY, Integer cartridges, Integer range) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, speed, posX, posY, cartridges, range);
    }
    public Sniper(String name, Vector2D coords) {
        super(name, 15.0f, 20, 12, 8, 10, 10, 9, 20, 3, coords.posX, coords.posY);
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append(" Снайпер:  \t").append(Sniper.super.name)
                .append("\t HP: \t").append(Sniper.super.hp)
                .append("\t State: ").append(Sniper.super.state)
                .append("\t Arrows: ").append(Sniper.super.cartridges);
    }
}
