package Unit;

public class Crossbowman  extends Shooter {


    public Crossbowman(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage,
                       Integer protection, Integer speed, Integer posX, Integer posY, Integer cartridges, Integer range) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, speed, posX, posY, cartridges, range);
    }

            public Crossbowman(String name, Vector2D coords) {
        super(name, 30.0f, 100, 10, 10, 20, 5,9, 10,2, coords.posX, coords.posY);
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append(" Арбалет: \t").append(Crossbowman.super.name)
                .append("\t HP: \t").append(Crossbowman.super.hp)
                .append("\t State: ").append(Crossbowman.super.state)
                .append("\t Arrows: ").append(Crossbowman.super.cartridges)
                ;
    }


}


