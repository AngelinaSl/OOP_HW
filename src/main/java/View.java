import Unit.Human;
import Unit.Vector2D;

import java.util.Collections;

public class View {
    private static int step = 1;
    private static final int[] l = {0};
    private static final String top10 = formatDiv("a") + String.join("", Collections.nCopies(9, formatDiv("--b"))) + formatDiv("--c");
    private static final String midl10 = formatDiv("d") + String.join("", Collections.nCopies(9, formatDiv("--e"))) + formatDiv("--f");
    private static final String bottom10 = formatDiv("g") + String.join("", Collections.nCopies(9, formatDiv("--h"))) + formatDiv("--i");
    private static void tabSetter(int cnt, int max){
        int dif = max - cnt + 2;
        if (dif>0) System.out.printf(AnsiColors.ANSI_MAGENTA +"%" + dif + "s", ":  \t\t\t"+ AnsiColors.ANSI_RESET); else System.out.print(":  \t\t\t");
    }
    private static String formatDiv(String str) {
        return str.replace('a', '\u250c')
                .replace('b', '\u252c')
                .replace('c', '\u2510')
                .replace('d', '\u251c')
                .replace('e', '\u253c')
                .replace('f', '\u2524')
                .replace('g', '\u2514')
                .replace('h', '\u2534')
                .replace('i', '\u2518')
                .replace('-', '\u2500');
    }
    private static String getChar(int x, int y){
        String out = "|  ";
        for (Human human: main.allTeam) {
            if (human.getCoords()[0] == x && human.getCoords()[1] == y){
                if (human.state == "✙") {
                    out = "|" + (AnsiColors.ANSI_RED +AnsiColors.ANSI_RED_BACKGROUND+ "\uD83E\uDD21" + AnsiColors.ANSI_RESET);
                    break;
                }

                if (main.darkTeam.contains(human)) out = "|" + (AnsiColors.ANSI_CYAN + AnsiColors.ANSI_CYAN_BACKGROUND + human.getInfo().toString().split("sym:")[1] + AnsiColors.ANSI_RESET);
                if (main.holyTeam.contains(human)) out = "|" + (AnsiColors.ANSI_YELLOW +AnsiColors.ANSI_YELLOW_BACKGROUND+ human.getInfo().toString().split("sym:")[1] + AnsiColors.ANSI_RESET);
                break;
            }
        }
        return out;
    }
    public static void view() {
        if (step == 1 ){
            System.out.print(AnsiColors.ANSI_RED + "First step" + AnsiColors.ANSI_RESET);
        } else {
            System.out.print(AnsiColors.ANSI_RED + "Step:" + step + AnsiColors.ANSI_RESET);
        }
        step++;
        main.allTeam.forEach((v) -> l[0] = Math.max(l[0], v.toString().length()));
        for (int i = 0; i < l[0]*2; i++) System.out.print("_");
        System.out.println("");
        System.out.print(top10 + "    ");
        System.out.print(AnsiColors.ANSI_MAGENTA+"Holy side"+ AnsiColors.ANSI_RESET);
        for (int i = 0; i < l[0]-9; i++) System.out.print(" ");
        System.out.println(AnsiColors.ANSI_MAGENTA + "\t\t\t\t:\t\t\t\t Dark side"+ AnsiColors.ANSI_RESET);
        for (int i = 1; i < 11; i++) {
            System.out.print(getChar(1, i));
        }



        System.out.print("|\t\t");
        System.out.print(AnsiColors.ANSI_YELLOW+ main.holyTeam.get(0)+ AnsiColors.ANSI_RESET);
        tabSetter(main.holyTeam.get(0).toString().length(), l[0]);
        System.out.println(AnsiColors.ANSI_CYAN+main.darkTeam.get(0)+ AnsiColors.ANSI_RESET);
        System.out.println(midl10);

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(getChar(i, j));
            }
            System.out.print("|\t\t");
            System.out.print(AnsiColors.ANSI_YELLOW+main.holyTeam.get(i-1)+ AnsiColors.ANSI_RESET);
            tabSetter(main.holyTeam.get(i-1).toString().length(), l[0]);
            System.out.println(AnsiColors.ANSI_CYAN+main.darkTeam.get(i-1)+ AnsiColors.ANSI_RESET);
            System.out.println(midl10);
        }
        for (int j = 1; j < 11; j++) {
            System.out.print(getChar(10, j));
        }
        System.out.print("|\t" +
                "\t");
        System.out.print(AnsiColors.ANSI_YELLOW+main.holyTeam.get(9)+ AnsiColors.ANSI_RESET);
        tabSetter(main.holyTeam.get(9).toString().length(), l[0]);
        System.out.println(AnsiColors.ANSI_CYAN+main.darkTeam.get(9)+ AnsiColors.ANSI_RESET);
        System.out.println(bottom10);
    }
}