package HomeWork6;

public class Dog extends PetAnimal {

    public final int MAX_RUN = 500;
    public final int MAX_SWIM = 50;

    public Dog(int id, String name) {
        super(id, name);
    }

    @Override
    protected void printAction() {
        System.out.println(this.toString());
    }

    @Override
    protected int setMaxRun() {
        return MAX_RUN;
    }

    @Override
    protected int setMaxSwim() {
        return MAX_SWIM;
    }

    @Override
    public String toString() {
        return "Dog " +
                "id " + id +
                ", name '" + name + '\'' +
                "run " + getLenRun() +
                " metres' swim " + getLenSwim() + " meters'.";
    }
}
