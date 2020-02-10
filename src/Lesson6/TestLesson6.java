package Lesson6;

public class TestLesson6 {

    public static void main(String[] args) {
//        Animal animal = new Animal("Имя животного", "Красный", 30);
//        Cat cat = new Cat("Барсик", "Белый", 3,  3);
        Cat cat = new Cat("Барсик", "Белый", 3,  3);
//        Dog dog = new Dog("Шарик", "Черный", 5,  1);
//        dog.jump();
        Dog dog = new Dog("Шарик", "Черный", 5,  1);
//        ( (Dog) dog).jump();

//        dog.voice();

//        Object[] animals = {cat, dog};

        printVoices(cat, dog);

//        cat.printInfo();
//        dog.printInfo();

//        animal.printInfo();
//        System.out.println("-----");
//        cat.catInfo();
//        cat.printInfo();
//        System.out.println("-----");
//        dog.dogInfo();
//
//        animal.voice();
//        System.out.println("-----");
//        cat.voice();
//        System.out.println("-----");
//        dog.voice();
    }

    private static void printVoices(Animal... animals) {
        for (Animal animal : animals) {
            animal.voice();
        }
    }

    private static void printVoices(Object... animals) {
        for (Object animal : animals) {
            System.out.println(animal.toString());
        }
    }
}
