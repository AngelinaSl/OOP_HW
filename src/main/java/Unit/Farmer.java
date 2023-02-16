package Unit;

public class Farmer extends Human {
    public Farmer(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed) {
        super(name, hp, maxHp, attack, damage, protection, speed);
    }


    public Farmer(String name) {
        super(name, 100, 100, 2, 4, 2, 20);


    }


    @Override
    public void getInfo() {
        System.out.printf("Я крестьянин %s! hp: %d, attack: %d\n", Farmer.super.name, Farmer.super.hp,Farmer.super.attack);

    }

    //    Кормит
    public void treat(Human human){
    }
    //    Подносит патроны
    public void armiger (Shooter Shooter){

    }
}
