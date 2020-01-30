package Lesson5;

public class TestCat {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat("Ryzik", "Black", 5);
        Cat cat4 = new Cat("Gbozdik", "Blue");
        Cat cat5 = new Cat("Dusy");

//        cat1.name = "Barsik";
//        cat1.color = "Rad";
//        cat1.age = 3;
        System.out.println(cat1);

        cat2.name = "Murzik";
        cat2.color = "Gray";
        cat2.age = 4;
        System.out.println(cat2);

        System.out.println(cat3);
    }
}
