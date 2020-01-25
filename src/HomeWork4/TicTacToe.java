package HomeWork4;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static int sizeMap;
    public static int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        getSizeMap();
        initMap();
        printMap();
//        while (true) {
//            humanTurn();
//            printMap();
//            if (checkWin(DOT_X)) {
//                System.out.println("Победил человек");
//                break;
//            }
//            if (isMapFull()) {
//                System.out.println("Ничья");
//                break;
//            }
//            aiTurn();
//            printMap();
//            if (checkWin(DOT_O)) {
//                System.out.println("Победил Искуственный Интеллект");
//                break;
//            }
//            if (isMapFull()) {
//                System.out.println("Ничья");
//                break;
//            }
//        }
//        System.out.println("Игра закончена");
    }

    private static void getSizeMap() {
        do {
            System.out.println("Введите число от 3 до 5 включительно для создания поля от 3х3 до 5х5: ");
            String sMap = sc.next();
            if (isDigit(sMap)) sizeMap = Integer.parseInt(sMap);
        } while (sizeMap < 3 || sizeMap > 5);
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

//    public static boolean checkWin(char symb) {
//        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
//        return false;
//    }
//    public static boolean isMapFull() {
//        for (int i = 0; i < sizeMap; i++) {
//            for (int j = 0; j < sizeMap; j++) {
//                if (map[i][j] == DOT_EMPTY) return false;
//            }
//        }
//        return true;
//    }
//    public static void aiTurn() {
//        int x, y;
//        do {
//            x = rand.nextInt(sizeMap);
//            y = rand.nextInt(sizeMap);
//        } while (!isCellValid(x, y));
//        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
//        map[y][x] = DOT_O;
//    }
//    public static void humanTurn() {
//        int x, y;
//        do {
//            System.out.println("Введите координаты в формате X Y");
//            x = sc.nextInt() - 1;
//            y = sc.nextInt() - 1;
//        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
//        map[y][x] = DOT_X;
//    }
//    public static boolean isCellValid(int x, int y) {
//        if (x < 0 || x >= sizeMap || y < 0 || y >= sizeMap) return false;
//        if (map[y][x] == DOT_EMPTY) return true;
//        return false;
//    }
    public static void initMap() {
        map = new char[sizeMap][sizeMap];
        for (char[] ch: map) {
            for (int j = 0; j < sizeMap; j++) {
                ch[j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        System.out.print("\t");
        for (int i = 0; i < sizeMap; i++) {
            System.out.print((i + 1) + "\t");
        }
        System.out.println();
        for (int i = 0; i < sizeMap; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < sizeMap; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
