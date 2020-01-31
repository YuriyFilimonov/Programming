package HomeWork6;

public class Cat extends PetAnimal {

    public static final int MAX_RUN = 400;
    public static final int MAX_SWIM = 40;

    public Cat(int id, String name) {
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
        return "Cat " +
                "id " + id +
                ", name '" + name + '\'' +
                "run " + getLenRun() +
                " metres' swim " + getLenSwim() + " meters'.";
    }
}
