package Lesson5;

public class Cat {
    String name;
    String color;
    int age;

    public Cat(){
        name = "Barsik";
        color = "Rad";
        age = 3;
    }

    public Cat(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat(String name, String color){
        this(name, color, 0);
    }

    public Cat(String name){
        this(name, null, 0);
    }

    public String getName() {
        return name;
    }

    public void sayMeow(){
        System.out.println("Meow");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
