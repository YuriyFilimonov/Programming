package HomeWork6;

public class Dog extends PetAnimal {

    public final int MAX_RUN = 500;
    public final int MAX_SWIM = 50;

    public Dog(int id, String name) {
        super(id, name);
    }

    @Override
    protected void run(int lenghtRun) {
        System.out.printf("Собака %s пробежала %d метров", name, lenghtRun);
    }

    @Override
    protected void swim(int lenghtSwim) {
        System.out.printf("Собака %s проплыла %d метров", name, lenghtSwim);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
