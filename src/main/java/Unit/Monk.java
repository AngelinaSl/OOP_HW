package Unit;

public class Monk extends Supernatural {

    int FreezeStep;
    public Monk(String name, Integer hp, Integer maxHp, Integer attack, Integer damage,
                Integer protection, Integer speed, int mana, int maxMana) {
        super(name, hp, maxHp, attack, damage, protection, speed, mana, maxMana);
        this.FreezeStep = FreezeStep;
    }



    public Monk(String name) {
        super(name, 100, 100, 1, 10, 60, 20, 50, 50 );
        this.FreezeStep = 7;


    }

    @Override
    public void getInfo() {
        System.out.printf("Я монах %s! hp: %d, attack: %d\n", Monk.super.name, Monk.super.hp,Monk.super.attack);

    }

    //замораживает ходы колдуна на несколько ходов
    public Integer FreezeWitch(Witch witch){
        return FreezeStep;
    }



}
