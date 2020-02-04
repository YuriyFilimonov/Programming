package HomeWork7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CatsYard {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        System.out.printf("Пригласите котиков в кошачий двор и дайте ему имя: имя/q - выход");
        String cat = scanner.next();
        if (cat == "q"){
            cats.add(new Cat("Barsik"));
        }
    }
}
