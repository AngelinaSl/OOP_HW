import Unit.*;

import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        int squad = 10;
        for (int i = 0; i < squad; i++) {
            int rnd = new Random().nextInt(1,8);
            switch (rnd) {
                case (1):
                    humans.add(new Farmer(getName()));
                    break;
                case (2):
                    humans.add(new Bandit(getName()));
                    break;

                case (3):
                    humans.add(new Spearman(getName()));
                    break;

                case (4):
                    humans.add(new Sniper(getName()));
                    break;

                case (5):
                    humans.add(new Crossbowman(getName()));
                    break;

                case (6):
                    humans.add(new Monk(getName()));
                    break;

                case (7):
                    humans.add(new Witch(getName()));
                    break;

            }
        }

        for (int i = 0; i < humans.size(); i++) {
            humans.get(i).getInfo();
        }

        humans.get(4).step(humans.get(3));
    }

    public static String getName(){

        String name1 = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        String int1 = String.valueOf(new Random().nextInt(3000));
        String name = name1 + "_"+ int1;

        return name;
    }
}
