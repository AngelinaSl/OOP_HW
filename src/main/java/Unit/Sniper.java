package Unit;

public class Sniper extends Shooter{
    public Sniper(String name, Vector2D coords) {
        super(name, 15.0f, 20, 12, 3, 5, 10, 9, 20, 3, coords.posX, coords.posY);
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер:  \t").append(Sniper.super.name)
                .append("\t HP: \t").append(Sniper.super.hp)
                .append("\t State: ").append(Sniper.super.state)
                .append("\t Arrows: ").append(Sniper.super.cartridges);
    }
    @Override
    public String toString() {

        return name +
                "\t|"+ "\uD83D\uDD2B" +
                "\t| H:" + Math.round(hp) +
                " \tDmg:" + Math.round(Math.abs((damageMin+damageMax)/2)) + "\t" +
                state +"  \t"+
                "\t\t";
    }
}
