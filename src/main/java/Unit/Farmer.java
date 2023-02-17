package Unit;

public class Farmer extends Human {
    public Farmer(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage, Integer protection, Integer speed, Integer posX, Integer posY) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, speed, posX, posY);
    }

    @Override
    public void step() {

    }


    public Farmer(String name) {
        super(name, 20.0f, 20, 2, 1, 1, 1, 3, 1,1);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Фермер: \t").append(Farmer.super.name)
                .append("\t HP: \t").append(Farmer.super.hp)
                .append("\t Speed: \t").append(Farmer.super.speed)
                .append("\t ATK: \t").append(Farmer.super.attack)
                ;
    }



    //    Кормит
    public void treat(Human human){
    }
    //    Подносит патроны
    public void armiger (Shooter Shooter){

    }
}
