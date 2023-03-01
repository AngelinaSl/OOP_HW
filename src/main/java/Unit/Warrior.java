package Unit;

import java.util.ArrayList;


public abstract class Warrior extends Human{

    public Warrior(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage, Integer protection, Integer speed, Integer posX, Integer posY) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, speed, posX, posY);
    }
    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (state.equals("Die")) return;
        int index = findNearest(team2);
        Human enemy = team2.get(index);
//        System.out.println(coords.getDistance(enemy.coords));

        if (coords.getDistance(enemy.coords) < 2 & enemy.hp >0) {
            enemy.getDamage(damageMax);
            return;
        }

            if (coords.getDown(enemy.coords)) {
                if (coords.posY - 1 > enemy.coords.posY && coords.getEmpty(team1, coords.posX, coords.posY - 1)) {
                    stepDown();
                } else {
                    sidestep(team1, enemy);
                }
            } else {
                if (coords.posY + 1 < enemy.coords.posY && coords.getEmpty(team1, coords.posX, coords.posY + 1)) {
                    stepUp();
                } else {
                    sidestep(team1, enemy);
                }

        }
    }
    protected void stepDown() {
        coords.posY -= 1;
    }

    protected void stepUp() {
        coords.posY += 1;
    }

    protected void sidestep(ArrayList<Human> team, Human enemy) {
        if (coords.getLeft(enemy.coords)) {
            if (coords.getEmpty(team, coords.posX - 1, coords.posY)){
                coords.posX -= 1;
            }
        } else {
            if (coords.getEmpty(team, coords.posX + 1, coords.posY)) {
                coords.posX += 1;
            }
        }
    }

    }

