package Unit;

import java.util.ArrayList;

public class Bandit extends Warrior {
    int disguise;

    public Bandit(String name, Vector2D coords) {
        super(name, 15.0f, 20, 8, 2, 4, 3, 6, coords.posX, coords.posY);
        this.disguise = 10;

    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Разбойник:\t").append(Bandit.super.name)
                .append("\t HP: \t").append(Bandit.super.hp)
                .append("\t sym:").append("\uD83D\uDC80");
    }

    @Override
    public String toString() {

        return name +
                "\uD83D\uDC80" +
                "\t| \uD83D\uDC8A:" + Math.round(hp) +
                " \t \uD83D\uDCAA:" + Math.round(Math.abs((damageMin+damageMax)/2)) + "\t" +
                state +"  \t"+
                "\t\t";
    }

}
