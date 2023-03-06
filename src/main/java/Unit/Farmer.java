package Unit;

import java.util.ArrayList;

public class Farmer extends Human {

    protected int cartridges;
    public Farmer(String name, Vector2D coords) {
        super(name, 15.0f, 20, 2, 1, 1, 1, 3, coords.posX, coords.posY);
        this.cartridges = 300;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Фермер:\t").append(Farmer.super.name)
                .append("\t HP: \t").append(Farmer.super.hp)
                .append("\t State: ").append(Farmer.super.state)
                .append("\t sym:").append("\uD83D\uDD28");
    }

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (state != "✙"){
            state = "❤";
        }
    }
    @Override
    public String toString() {

        return name +
                "\uD83D\uDD28" +
                "\t| \uD83D\uDC8A:" + Math.round(hp) +
                " \t \uD83D\uDCAA:" + Math.round(Math.abs((damageMin+damageMax)/2)) + "\t" +
                state +"  \t"+
                "\t\t";
    }

}