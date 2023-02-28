package Unit;

import java.util.ArrayList;

public class Farmer extends Human {

    protected int cartridges;

    public Farmer(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense, int speed, int cartridges, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.cartridges = cartridges;
    }

    public Farmer(String name, Vector2D coords) {
        super(name, 15.0f, 20, 2, 1, 1, 1, 3, coords.posX, coords.posY);
        this.cartridges = 300;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append(" Фермер:\t").append(Farmer.super.name)
                .append("\t HP: \t").append(Farmer.super.hp)
                .append("\t State: ").append(Farmer.super.state);
    }

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (state != "Die"){
            state = "Stand";
        }
    }

}