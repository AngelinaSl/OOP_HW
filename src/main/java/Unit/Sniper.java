package Unit;

public class Sniper extends Shooter{
    public Sniper(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed, int cartridges, int range) {
        super(name, hp, maxHp, attack, damage, protection, speed, cartridges, range);
    }

    public Sniper(String name) {
        super(name, 100, 100, 15, 15, 5, 3, 10, 10);
    }

    @Override
    public void getInfo() {
        System.out.printf("Я снайпер %s! hp: %d, attack: %d\n", Sniper.super.name, Sniper.super.hp,Sniper.super.attack);

    }
    //    Атака дальнего боя с возможностью ранить 2х игроков
    @Override
    public Integer getAttack() {
        return attack;
    }
}
