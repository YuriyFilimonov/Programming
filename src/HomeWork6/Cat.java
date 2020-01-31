package HomeWork6;

public class Cat extends PetAnimal {

    public static final int MAX_RUN = 400;
    public static final int MAX_SWIM = 40;

    public Cat(int id, String name) {
        super(id, name);
    }

    @Override
    protected void run(int lenghtRun) {
        System.out.printf("Кошка %s пробежал %d метров", name, lenghtRun);
    }

    @Override
    protected void swim(int lenghtSwim) {
        System.out.printf("Кошка %s проплыла %d метров", name, lenghtSwim);
    }
}
