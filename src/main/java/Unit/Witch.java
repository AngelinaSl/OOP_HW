package Unit;

public class Witch extends Magic {

    public Witch(String name, Vector2D coords) {
        super(name, 15.0f, 20, 17, -5, -8, 12, 8, coords.posX, coords.posY);
        mana = 15;

    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Колдун:   \t").append(Witch.super.name)
                .append("\t HP: \t").append(Witch.super.hp)
                .append("\t State: ").append(Witch.super.state)
                .append("\t MP: \t").append(Witch.super.mana)
                .append("\t sym:").append("\uD83E\uDDD9");
    }
    @Override
    public String toString() {

        return name +
                "\uD83E\uDDD9"+
                "\t| \uD83D\uDC8A:" + Math.round(hp) +
                " \t \uD83D\uDCAA:" + Math.round(Math.abs((damageMin+damageMax)/2)) + "\t" +
                state +"  \t"+
                "\t\t";
    }
}
