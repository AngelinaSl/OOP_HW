package Unit;
public class Spearman extends Warrior {

    public Spearman(String name, Vector2D coords) {
        super(name, 15.0f, 20, 4, 1, 3, 5, 4, coords.posX, coords.posY);


    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик: \t").append(Spearman.super.name)
                .append("\t HP: \t").append(Spearman.super.hp)
                .append("\t State: ").append(Spearman.super.state)
                .append("\t sym:").append("\uD83E\uDD3A");
    }
    @Override
    public String toString() {

        return name +
                "\uD83E\uDD3A" +
                "\t| \uD83D\uDC8A:" + Math.round(hp) +
                " \t \uD83D\uDCAA:" + Math.round(Math.abs((damageMin+damageMax)/2)) + "\t" +
                state +"  \t"+
                "\t\t";
    }
}
