package Unit;

public class Crossbowman  extends Shooter {

    public Crossbowman(String name, Vector2D coords) {
    super(name, 15.0f, 20, 10, 2, 3, 5,9, 10,2, coords.posX, coords.posY);

    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалет: \t").append(Crossbowman.super.name)
                .append("\t HP: \t").append(Crossbowman.super.hp)
                .append("\t State: ").append(Crossbowman.super.state)
                .append("\t Arrows: ").append(Crossbowman.super.cartridges)
                .append("\t sym:").append("\uD83C\uDFF9");
    }

    @Override
    public String toString() {

        return name +
                "\uD83C\uDFF9" +
                "\t| \uD83D\uDC8A:" + Math.round(hp) +
                " \t \uD83D\uDCAA:" + Math.round(Math.abs((damageMin+damageMax)/2)) + "\t" +
                state +"  \t"+
                "\t\t";
    }
}


