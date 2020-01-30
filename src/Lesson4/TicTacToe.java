package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final int SIZE = 5;
    private static final int DOTS_TO_WIN = 4;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    public static final String EMPTY_COLUMN_TITLE = "  ";

    private static char[][] map;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        playGame();
        System.out.println("Игра окончена!");
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();

            if (checkEnd(DOT_X, "Пользователь победил!"))
                break;

            aiTurn();
            printMap();
            if (checkEnd(DOT_O, "Компьютер победил!"))
                break;
        }
    }

    private static boolean checkEnd(char symbol, String winMessage) {
        if (checkWin(symbol)) {
            System.out.println(winMessage);
            return true;
        }
        if (isMapFull()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }

        return true;
    }

    private static int[] getCellToBlockCompetitor(char symbol) {
        return getFirstNotNull(
                getCellToBlockCompetitor(symbol, true),
                getCellToBlockCompetitor(symbol, false),
                getCellToBlockCompetitorByDiagonal(symbol, true),
                getCellToBlockCompetitorByDiagonal(symbol, false)
        );
    }

    private static int[] getCellToBlockCompetitorByDiagonal(char symbol, boolean searchByMainDiag) {
        int counter = 0;
        int rowCellStart = -1;
        int lastIndex = SIZE - 1;
        for (int i = 0; i < SIZE; i++) {
            char value = searchByMainDiag ? map[i][i] : map[i][lastIndex - i];
            counter = (value == symbol) ? counter + 1 : 0;
            if (counter > 0 && rowCellStart < 0) {
                rowCellStart = i;
            }
            else if (counter == 0) {
                rowCellStart = i;
            }

            if (counter == DOTS_TO_WIN - 1) {
                int[] blockCell = getApplicableCellForBlockByDiag(searchByMainDiag, rowCellStart - 1, rowCellStart + DOTS_TO_WIN - 1);
                if (blockCell != null) {
                    return blockCell;
                }
            }
        }

        return null;
    }

    private static int[] getCellToBlockCompetitor(char symbol, boolean searchByRows) {
        for (int i = 0; i < SIZE; i++) {
            int counter = 0;
            int cellStart = -1;

            for (int j = 0; j < SIZE; j++) {
                char value = searchByRows ? map[i][j] : map[j][i];
                counter = (value == symbol) ? counter + 1 : 0;
                if (counter > 0 && cellStart < 0) {
                    cellStart = j;
                }
                else if (counter == 0) {
                    cellStart = -1;
                }

                if (counter == DOTS_TO_WIN - 1) {
                    int[] blockCell = getApplicableCellForBlock(i, searchByRows, cellStart - 1, cellStart + DOTS_TO_WIN - 1);
                    if (blockCell != null) {
                        return blockCell;
                    }
                }
            }
        }

        return null;
    }

    private static int[] getApplicableCellForBlock(int fixedIndex, boolean searchByRow, int... varIndexes) {
        for (int varIndex : varIndexes) {
            if (varIndex < 0 || varIndex >= SIZE) {
                continue;
            }

            char value = searchByRow ? map[fixedIndex][varIndex] : map[varIndex][fixedIndex];

            if (value == DOT_EMPTY) {
                return searchByRow ? new int[] {fixedIndex, varIndex} : new int[] {varIndex, fixedIndex};
            }
        }

        return null;
    }

    private static int[] getApplicableCellForBlockByDiag(boolean searchByMainDiag, int... rows) {
        int lastIndex = SIZE - 1;

        for (int row : rows) {
            if (row < 0 || row >= SIZE) {
                continue;
            }

            char value = searchByMainDiag ? map[row][row] : map[row][lastIndex - row];

            if (value == DOT_EMPTY) {
                return searchByMainDiag ? new int[] {row, row} : new int[] {row, lastIndex - row};
            }
        }

        return null;
    }

    private static int[] getApplicableRowCellForBlock(int fixedCol, int... rows) {
        for (int row : rows) {
            if (row < 0 || row >= SIZE) {
                continue;
            }

            if (map[row][fixedCol] == DOT_EMPTY) {
                return new int[] {row, fixedCol};
            }
        }

        return new int[0];
    }

    private static boolean checkWin(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            int rowCounter = 0;
            int colCounter = 0;
            for (int j = 0; j < SIZE; j++) {
                rowCounter = (map[i][j] == symbol) ? rowCounter + 1 : 0;
                colCounter = (map[j][i] == symbol) ? colCounter + 1 : 0;
                if (rowCounter == DOTS_TO_WIN || colCounter == DOTS_TO_WIN) {
                    return true;
                }
            }
        }

        int mainDiagCounter = 0;
        int sideDiagCounter = 0;
        for (int i = 0; i < SIZE; i++) {
            mainDiagCounter = (map[i][i] == symbol) ? mainDiagCounter + 1 : 0;
            sideDiagCounter = (map[i][map.length - 1 - i] == symbol) ? sideDiagCounter + 1 : 0;
            if (mainDiagCounter == DOTS_TO_WIN || sideDiagCounter == DOTS_TO_WIN) {
                return true;
            }
        }

        return false;
    }

    private static void humanTurn() {
        int rowNumber, colNumber;
        do {
            System.out.println("Ход пользователя. Введите номер строки и столбца");
            System.out.print("Строка = ");
            rowNumber = scanner.nextInt();
            System.out.print("Колонка = ");
            colNumber = scanner.nextInt();
        } while (!isCellValid(rowNumber, colNumber));

        map[rowNumber - 1][colNumber - 1] = DOT_X;
    }

    private static void aiTurn() {
        System.out.println("Ход компьютера");

        boolean userBlocked = blockUserCell();
        if (!userBlocked) {
            setRandomCell();
        }
    }

    private static void setRandomCell() {
        int rowNumber, colNumber;
        do {
            rowNumber = random.nextInt(SIZE) + 1;
            colNumber = random.nextInt(SIZE) + 1;
        } while (!isCellValid(rowNumber, colNumber));

        map[rowNumber - 1][colNumber - 1] = DOT_O;
    }

    private static boolean blockUserCell() {
        int[] cell = getCellToBlockCompetitor(DOT_X);
        if (cell != null) {
            int rowIndex = cell[0];
            int colIndex = cell[1];
            map[rowIndex][colIndex] = DOT_O;
            return true;
        }
        return false;
    }

    private static boolean isCellValid(int rowNumber, int colNumber) {
        if (rowNumber < 1 || rowNumber > SIZE)
            return false;
        if (colNumber < 1 || colNumber > SIZE)
            return false;

        return map[rowNumber - 1][colNumber - 1] == DOT_EMPTY;
    }

    private static void printMap() {
        printMapHeader();
        printMapRows();
    }

    private static void printMapRows() {
        for (int i = 0; i < SIZE; i++) {
            printColumnNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printColumnNumber(int i) {
        int columnNumber = i + 1;
        System.out.print(columnNumber + " ");
    }

    private static void printMapHeader() {
        printEmptyHeaderForFirstColumn();
        for (int i = 0; i < SIZE; i++) {
            printColumnNumber(i);
        }
        System.out.println();
    }

    private static void printEmptyHeaderForFirstColumn() {
        System.out.print(EMPTY_COLUMN_TITLE);
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static int[] getFirstNotNull(int[]... values) {
        for (int[] value : values) {
            if (value !=  null) {
                return value;
            }
        }

        return null;
    }
}
