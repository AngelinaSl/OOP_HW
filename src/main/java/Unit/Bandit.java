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
                .append("\t HP: \t").append(Bandit.super.hp);
    }



    @Override
    public String toString() {

        return name +
                "\t|"+ "\uD83D\uDC80" +
                "\t| H:" + Math.round(hp) +
                " \tDmg:" + Math.round(Math.abs((damageMin+damageMax)/2)) + "\t" +
                state +"  \t"+
                "\t\t";
    }
}
