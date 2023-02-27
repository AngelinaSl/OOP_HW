package Unit;



import java.util.ArrayList;
import java.util.Random;

public abstract class Human implements GameInterfaсe {

    protected String name;
    protected float hp;
    protected int maxHp;
    protected int attack;
    protected int damageMin;
    protected int damageMax;
    protected int defense;
    protected int speed;
    protected Vector2D coords;
    protected String state;

    public Human(String name, float hp, int maxHp, int attack, int damageMin, int damageMax,
                 int defense, int speed, int posX, int posY) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.defense = defense;
        this.speed = speed;
        this.coords = new Vector2D(posX, posY);
        this.state = "Stand";
    }



    public int getAttack() {
        return this.attack;
    }
    public int getDefense() { return this.defense; }
    public int getSpeed() { return this.speed; }
    public float getHp () { return this.hp; }
    public float setHp (float hp) { return this.hp = hp; }

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) { }

    protected void makeDamage (Human enemy) {
        int damage = enemy.getDefense() - attack;
        if (damage>0) {
            if (enemy.hp > damageMin) {
                enemy.hp = enemy.hp - damageMin;
            } else enemy.hp = 0;
        }
        if (damage < 0) {
            if (enemy.hp > damageMax) {
                enemy.hp = enemy.hp - damageMax;
            }
        }
        else {
            enemy.hp = enemy.hp - ((damageMin+damageMax)/2);
            if (enemy.hp < 0){
                enemy.hp = 0;
            }
        }
    }

    protected void getDamage(float damage){
        hp -= damage;
        if (hp > maxHp) hp = maxHp;
        if (hp < 0) state = "Die";
    }







    public int findNearest(ArrayList<Human> team){
        double min = 100;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if(min > coords.getDistance(team.get(i).coords)) {
                index = i;
                min = coords.getDistance(team.get(i).coords);
            }
        }
        return index;
    }
    public static ArrayList<Human> findLive(ArrayList<Human> team) {
        ArrayList findLive = new ArrayList<>();
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).getHp() > 0 ) {
                findLive.add(team.get(i));
            }
        }
        return findLive;
    }

    @Override
    public StringBuilder getInfo() {
        return null;
    }
}