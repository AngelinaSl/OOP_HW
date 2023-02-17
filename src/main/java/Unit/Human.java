package Unit;

import Unit.GameInterface;

import java.util.Random;

public abstract class Human implements GameInterface {

    protected String name;
    protected Float hp;
    protected Integer maxHp;
    protected Integer attack;
    protected Integer minDamage;
    protected Integer maxDamage;

    protected Integer protection;
    protected Integer speed;
    protected Integer posX;
    protected Integer posY;



    public Human(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage,
                 Integer maxDamage, Integer protection, Integer speed, Integer posX, Integer posY) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.protection = protection;
        this.speed = speed;
        this.posX = posX;
        this.posY = posY;
    }

    public String getName() {return name;}
    public Integer getAttack() {
        return attack;
    }
    public Integer getProtection() {
        return protection;
    }
    public Float getHp() {return hp;}
    public Integer getMinDamage() {return minDamage;}
    public Integer getSpeed() {return speed;}
    public Integer getPosX() {return posX;}
    public Integer getPosY() {return posY;}

    public void setHp(Float hp) {
        this.hp = hp;
    }


}
