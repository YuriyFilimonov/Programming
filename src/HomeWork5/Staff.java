package HomeWork5;

public class Staff {
    public int id;
    public String surname;
    public String firstname;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Staff(String surname, String firstname){
        this.surname = surname;
        this.firstname = firstname;
    }

    public Staff(String surname) {
        this(surname, null);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                "руб., age=" + age + "лет" +
                '}';
    }
}
