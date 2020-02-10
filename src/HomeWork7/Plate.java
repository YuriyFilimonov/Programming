package HomeWork7;

import java.util.Random;
import java.util.Scanner;

public class Plate {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    private int capacityFood; //Вместимость тарелки
    private int food;
    final int MIN_CAPACITY = 300; //Минимальная и максимальная вместимость тарелки
    final int MAX_CAPASITY = 1000;

    public int getFood() {
        return food;
    } //Еду получают из тарелки

    public void setFood(int food) {
        this.food = food;
    } //Еда поступает в тарелку в каком-то количестве

    public void getCapacityFood() {
        capacityFood = MIN_CAPACITY + random.nextInt(MAX_CAPASITY - MIN_CAPACITY);
    }

    public void addFood(){ //Хозяин накладывает еду. Количество регулирует сам, хоть по 1 грамму.
        do {
            System.out.printf("Котики хотят кушать, положите корм в тарелку не более %d граммов: ", capacityFood);
            String fd = scanner.next();
            isDigit(fd);
            if (isDigit(fd)) food = Integer.parseInt(fd);
        } while (food < 0 || food > capacityFood);
        System.out.print(toString());
    }

    public void plateInfo(){
        System.out.printf(this + "%n");
    }

    @Override
    public String toString() {
        return "Plate{" +
                "capacityFood=" + capacityFood +
                ", food=" + food +
                '}';
    }

    public static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}