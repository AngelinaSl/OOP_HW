package Unit;

import java.util.ArrayList;

public abstract class Shooter extends Human {
    protected int range;
    protected int cartridges;
    protected Shooter(String name, float hp, int maxHp, int attack, int damageMin,
                      int damageMax, int defense, int speed, int cartridges,
                      int range, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.range = range;
        this.cartridges = cartridges;
    }
    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (state.equals("Die") || cartridges == 0) return;
        makeDamage(team2.get(findNearest(team2)));
        if (team2.get(findNearest(team2)).hp <= 0) {
            team2.get(findNearest(team2)).state = "Die";
        }
        if (findFarmer(team1) == true){
            return;
        }
        else cartridges--;
    }
    protected boolean findFarmer(ArrayList<Human> team) {
        ArrayList <Human> arrayFarmer = new ArrayList<>();
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).getInfo().toString().split(":")[0].equals("Фермер")  && team.get(i).state.equals("Stand")) {
                    arrayFarmer.add(team.get(i));
            }
        }
        switch (arrayFarmer.size()) {
            case (0):
                return false;
            default:
                return true;
        }
    }
}
