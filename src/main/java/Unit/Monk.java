package Unit;

import java.util.ArrayList;

public class Monk extends Magic {
    public Monk(String name, Vector2D coords) {
        super(name, 15.0f, 20, 12, -4, -6, 7, 5, coords.posX, coords.posY);
        mana = 10;
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Монах:   \t").append(Monk.super.name)
                .append("\t HP:  \t").append(Monk.super.hp)
                .append("\t State: ").append(Monk.super.state)
                .append("\t MP: \t").append(Monk.super.mana)
                .append("\t sym:").append("\uD83D\uDE4F");

    }
    @Override
    public String toString() {

        return name +
                 "\uD83D\uDE4F" +
                "\t| \uD83D\uDC8A:" + Math.round(hp) +
                " \t \uD83D\uDCAA:" + Math.round(Math.abs((damageMin+damageMax)/2)) + "\t" +
                state +"  \t"+
                "\t\t";
    }
}
