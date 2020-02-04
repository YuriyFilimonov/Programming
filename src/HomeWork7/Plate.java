package HomeWork7;

import java.util.Scanner;

public class Plate {
    Scanner scanner = new Scanner(System.in);
    private int food;
    public int capacityFood; //Вместимость тарелки

    public Plate(int capacityFood) {
        this.capacityFood = capacityFood;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void plateInfo(){
        System.out.printf("Вместимость тарелки: %d грамм, количество еды в тарелке: %d грамм", capacityFood, food);
    }

    public void addFood(){
        do {
            System.out.printf("Котик %s хочет кушать, положите корм в тарелку не более %d граммов: ", capacityFood);
//        System.out.println("Хозяйка добавила корм в тарелку: " + (capacityFood - food) + " грамм");
            String fd = scanner.next();
            isDigit(fd);
            if (isDigit(fd)) food = Integer.parseInt(fd);
//            return food;
        } while (food < 0 || food > capacityFood);
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}