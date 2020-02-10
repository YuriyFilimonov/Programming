package Lesson6;

public class Cat extends PetAnimal {

    //    private String name;
    private int weight;

    public Cat(String name, String color, int age, int weight) {
        super(name, color, age);
        this.weight = weight;
//        this.name = super.name;
    }

    public Cat(String name, String color, int age) {
        this(name, color, age, 0);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void printInfo() {
        System.out.printf("Кличка = %s; Цвет = %s; Возраст = %d; Вес = %d%n",
                getName(),
                getColor(),
                getAge(),
                getWeight());
    }

    @Override
    public void voice() {
//        super.voice();
        System.out.println("Кот сказал 'Мяу!'");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                '}';
    }


    public void test(int a, int b) {
        super.test(a);
    }
}