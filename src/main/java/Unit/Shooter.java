package Unit;

public abstract class Shooter extends Human {
    int range;
    int cartridges;

    public Shooter(String name, Float hp, Integer maxHp, Integer attack, Integer minDamage, Integer maxDamage,
                   Integer protection, Integer speed, Integer posX, Integer posY, Integer cartridges, Integer range) {
        super(name, hp, maxHp, attack, minDamage, maxDamage, protection, speed, posX, posY);
        this.range = range;
        this.cartridges = cartridges;
    }



    public int getRange() {return range;}
    public void setRange(int range) {this.range = range;}


    @Override
    public void step() {
        int cart = getCartridges();
        if (cart > 0) {
            setCartridges(cart-1);
        }
    }

    public int getCartridges() {
        return this.cartridges;
    }

    public void setCartridges(int cartridges) {
        this.cartridges = cartridges;
    }
}
