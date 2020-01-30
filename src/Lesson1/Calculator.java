package Lesson1;

public class Calculator {
    private final String name;

    public Calculator(String name) {
        this.name = name;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int mul(int a, int b) {
        return  a * b;
    }

    @Override
    public String toString() {
        return "Calculator '" + name + "'";
    }
}
