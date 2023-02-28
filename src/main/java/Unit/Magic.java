package Unit;

import java.util.ArrayList;
import java.util.Random;

public abstract class Magic extends Human {
    protected int mana;
    protected int maxMana;

    public Magic(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage, Integer protection, Integer speed, Integer posX, Integer posY) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, speed, posX, posY);
        this.mana = mana;
        this.maxMana = maxMana;

    }
    public ArrayList<Human> SearchWounded(ArrayList<Human> team) {
        ArrayList<Human> wounded = new ArrayList<>();
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).hp < team.get(i).maxHp && team.get(i).state.equals("Stand")) {
                wounded.add(team.get(i));
            }
        }
        return wounded;
    }
    public void makeHealing(ArrayList<Human> team){
        int size = team.size();
//        int magDamage = new Random().nextInt(damageMin, damageMax);
        int indexRandomWounded = new Random().nextInt(0, size);

        if (team.get(indexRandomWounded).hp - damageMax > team.get(indexRandomWounded).maxHp){
            team.get(indexRandomWounded).hp = team.get(indexRandomWounded).maxHp;
            System.out.printf("%s healing %s\n", name,team.get(indexRandomWounded).name );
        }
        else{
            team.get(indexRandomWounded).hp = team.get(indexRandomWounded).hp - damageMax;
        }
    }
    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (state.equals("Die") || mana == 0) return;
        makeHealing(SearchWounded(team1));
        mana-=5;
        return;




    }
}

