import Unit.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        ArrayList<Human> holyTeam = new ArrayList<>();
        ArrayList<Human> darkTeam = new ArrayList<>();
        ArrayList<Human> allTeam = new ArrayList<>();
        Scanner user_input = new Scanner(System.in);
        createTeam(holyTeam, 1, 5, 1);
        createTeam(darkTeam, 4, 8, 10);
        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);

        while (true) {
            sortTeam(holyTeam);
            sortTeam(darkTeam);
            sortTeam(allTeam);
            if (Human.findLive(holyTeam).size() != 0 && Human.findLive(darkTeam).size() != 0) {
                getInfoGame(holyTeam, darkTeam);
                for (Human character : allTeam) {
                    if (holyTeam.contains(character)) {
                        character.step(Human.findLive(holyTeam), Human.findLive(darkTeam));
                    } else {
                        character.step(Human.findLive(darkTeam), Human.findLive(holyTeam));
                        }
                }
                user_input.nextLine();
            }

            else {
                searchWinner(holyTeam, darkTeam);
                break;
            }
        }
    }
        static void createTeam (ArrayList team,int start, int end, int posY){
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
        static void getInfoGame (ArrayList < Human > team1, ArrayList < Human > team2){
            printingHeadlines();
            for (int i = 0; i < team1.size(); i++) {
                System.out.println(team1.get(i).getInfo());
            }
            printingLine();

            printingHeadlines();
            for (int i = 0; i < team2.size(); i++) {
                System.out.println(team2.get(i).getInfo());
            }
            printingLine();
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
        static void printingLine () {
            System.out.println("+-------------------------------------------------------------------+");
        }
        static void printingHeadlines () {
            System.out.println("+-------------------------------------------------------------------+");
            System.out.println("|  Класс   |    Имя    |      HP     |     State     |  Arrows|Mana |");
            System.out.println("+-------------------------------------------------------------------+");
        }
        static void searchWinner (ArrayList < Human > holyTeam, ArrayList < Human > darkTeam){
            int holySize = Human.findLive(holyTeam).size();
            int darkSize = Human.findLive(darkTeam).size();
            System.out.println(holySize > darkSize ? "Победила команда Света" : "Победила команда Тьмы");
        }
    }


