import Unit.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class main {
    public static void main(String[] args) {

        ArrayList<Human> team1 = new ArrayList<>();

        ArrayList<Human> team2 = new ArrayList<>();
        ArrayList<Human> teams = new ArrayList<>();
        createTeam(team1, 0, 4);
        createTeam(team2, 3,7);
        teams.addAll(team1);
        teams.addAll(team2);

        teams.sort(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return  o1.getSpeed() - o2.getSpeed();
            }
        });

        System.out.println();
        for (int i = 0; i < teams.size(); i++) {
            System.out.println(teams.get(i).getInfo());
        }
        System.out.println("-----------");
        team1.add(new Sniper("Reon"));

        System.out.println(team1.get(10).getInfo());
        team1.get(0).step();
        System.out.println(team1.get(10).getInfo());

    }

    public static void createTeam(ArrayList targetList, int start, int end) {
        int units = 10;
        for (int i = 0; i < units; i++) {
            int rnd = new Random().nextInt(start, end);
            switch (rnd) {
                case (0):
                    targetList.add(new Sniper(getName()));
                    break;
                case (1):
                    targetList.add(new Witch(getName()));
                    break;
                case (2):
                    targetList.add(new Bandit(getName()));
                    break;
                case (3):
                    targetList.add(new Farmer(getName()));
                    break;
                case (4):
                    targetList.add(new Crossbowman(getName()));
                    break;
                case (5):
                    targetList.add(new Spearman(getName()));
                    break;
                case (6):
                    targetList.add(new Monk(getName()));
                    break;
            }
        }
    }



    public static String getName(){
        String name1 = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        String int1 = String.valueOf(new Random().nextInt(1000, 3000));
        String name = name1 + "_"+ int1;
        return name;
    }
}
