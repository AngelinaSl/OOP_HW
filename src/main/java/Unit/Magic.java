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
            if (team.get(i).hp < team.get(i).maxHp && team.get(i).state.equals("❤")) {
                wounded.add(team.get(i));
            }
        }
        return wounded;
    }


    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (state.equals("✙") || mana == 0) return;
        for (Human human: team1
             ) {
            float newHp = human.getHp()-damageMax;
            if (newHp > human.getMaxHp()) {
                human.getDamage(human.getMaxHp()-human.hp);
            } else {
                human.getDamage(damageMax);
            }
        }
        mana-=5;
    }
}

