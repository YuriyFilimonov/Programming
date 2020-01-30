package Lesson3;

import java.util.Objects;

public class Person {

    public static void main(String[] args) {
        Person person = new Person("Oleg");
        Person person2 = new Person("Oleg");
        System.out.println(person);
        System.out.println(person.equals(person2));
    }

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
