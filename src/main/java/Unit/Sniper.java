package Unit;

public class Sniper extends Shooter{
    public Sniper(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage,
                  Integer protection, Integer speed, Integer posX, Integer posY, Integer cartridges, Integer range) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, speed, posX, posY, cartridges, range);
    }


    public Sniper(String name) {
        super(name, 15.0f, 30, 12, 8, 10, 10, 9, 2, 3, 12, 3);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер: \t").append(Sniper.super.name)
                .append("\t HP: \t").append(Sniper.super.hp)
                .append("\t Speed: \t").append(Sniper.super.speed)
                .append("\t ATK: \t").append(Sniper.super.attack)
                .append("\t Arrows: ").append(Sniper.super.cartridges);
    }
    //    Атака дальнего боя с возможностью ранить 2х игроков
    @Override
    public Integer getAttack() {
        return attack;
    }
}
