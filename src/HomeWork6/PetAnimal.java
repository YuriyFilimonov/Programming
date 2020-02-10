package HomeWork6;

public abstract class PetAnimal {
    public int id;
    public String name;
    private int lenRun;
    private int lenSwim;

    public PetAnimal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    protected abstract void printAction();
    protected abstract int setMaxRun();
    protected abstract int setMaxSwim();

    public int getLenRun() {
        return lenRun;
    }

    public void setLenRun(int lenRun) {
        this.lenRun = lenRun;
    }

    public int getLenSwim() {
        return lenSwim;
    }

    public void setLenSwim(int lenSwim) {
        this.lenSwim = lenSwim;
    }
}
