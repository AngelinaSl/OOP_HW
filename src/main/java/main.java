import Unit.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class main {

    static final int UNITS = 10;
    public static ArrayList<Human> allTeam = new ArrayList<>();
    public static ArrayList<Human> holyTeam = new ArrayList<>();
    public static ArrayList<Human> darkTeam = new ArrayList<>();

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        user_input.nextLine();
        createTeam(holyTeam, 1, 5, 1);
        createTeam(darkTeam, 4, 8, 10);
        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        ArrayList<Human> holyLive = new ArrayList<>(holyTeam);
        ArrayList<Human> darkLive = new ArrayList<>(darkTeam);
        sortTeam(allTeam);

        while (true) {
            View.view();
            user_input.nextLine();
            for (Human human: allTeam) {
                if (holyLive.size() != 0 && darkLive.size() != 0) {
//                    searchWinner(holyTeam, darkTeam);
                    if (holyTeam.contains(human)) {
                        human.step(holyLive, darkLive);
                        darkLive = findLive(darkTeam);
                    } else {
                        human.step(darkLive, holyLive);
                        holyLive = findLive(holyTeam);
                    }
                } else {
                    View.view();
                    searchWinner(holyTeam, darkTeam);

                    return;
                }
            }
        }
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

    static void createTeam(ArrayList team, int start, int end, int posY) {
        int units = 10;
        for (int i = 1; i <= units; i++) {
            int rnd = new Random().nextInt(start, end);
            switch (rnd) {
                case (1):
                    team.add(new Sniper(getName(), new Vector2D(i, posY)));
                    break;
                case (2):
                    team.add(new Bandit(getName(), new Vector2D(i, posY)));
                    break;
                case (3):
                    team.add(new Witch(getName(), new Vector2D(i, posY)));
                    break;
                case (4):
                    team.add(new Farmer(getName(), new Vector2D(i, posY)));
                    break;
                case (5):
                    team.add(new Crossbowman(getName(), new Vector2D(i, posY)));
                    break;
                case (6):
                    team.add(new Monk(getName(), new Vector2D(i, posY)));
                    break;
                case (7):
                    team.add(new Spearman(getName(), new Vector2D(i, posY)));
                    break;
            }
        }
    }

        static void sortTeam (ArrayList < Human > team) {
            team.sort((o1, o2) -> o2.getSpeed() - o1.getSpeed());
        }
        public static String getName () {
            String name1 = String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
            String int1 = String.valueOf(new Random().nextInt(1000, 3000));
            String name = name1 + "_" + int1;
            return name;
        }

        static void searchWinner (ArrayList < Human > holyTeam, ArrayList < Human > darkTeam){

            int holySize = findLive(holyTeam).size();
            int darkSize = findLive(darkTeam).size();

            if (holySize == 0){
                System.out.println(AnsiColors.ANSI_CYAN+"*********************"+ AnsiColors.ANSI_RESET);
                System.out.println(AnsiColors.ANSI_CYAN+"Победила команда Тьмы"+ AnsiColors.ANSI_RESET);
                System.out.println(AnsiColors.ANSI_CYAN+"*********************"+ AnsiColors.ANSI_RESET);
            }
            else if (darkSize == 0){
                System.out.println(AnsiColors.ANSI_YELLOW+"**********************"+ AnsiColors.ANSI_RESET);
                System.out.println(AnsiColors.ANSI_YELLOW+"Победила команда Света"+ AnsiColors.ANSI_RESET);
                System.out.println(AnsiColors.ANSI_YELLOW+"**********************"+ AnsiColors.ANSI_RESET);
            }

        }
}




