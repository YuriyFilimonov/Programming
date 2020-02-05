package HomeWork7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatsYard {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        Plate plate = new Plate(); // Инициализация тарелки
        plate.getCapacityFood();

        String caty; //Создаем кошачий двор
        do {
            System.out.print("Пригласите котиков в кошачий двор и дайте им имена: имя/количество/q - выход: ");
            caty = scanner.next();
            if (Plate.isDigit(caty)){
                getNumberCat(cats, caty);
                break;
            }
            if (caty.equals("q") && cats.size() == 0){
                cats.add(new Cat("Barsik"));
            }
            if (!caty.equals("q")){
                cats.add(new Cat(caty));
            }
        } while (!caty.equals("q"));

        for (Cat cat : cats) {
            System.out.println(cat.toString());
        }

        plate.addFood(); //Засыпаем в тарелку корм
        System.out.println();

        System.out.println("Покормим котят.");
        for (Cat cat : cats) {
            cat.eat(plate);
        }

        System.out.println("Game over");
    }

    private static void getNumberCat(List<Cat> cats, String caty) {
        int cat = Integer.parseInt(caty);
        for (int i = 0; i < cat; i++) {
            cats.add(new Cat(("Cat" + i)));
        }
    }
}
