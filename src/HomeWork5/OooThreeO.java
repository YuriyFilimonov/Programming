package HomeWork5;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class OooThreeO {
    public static Random random = new Random();
    public static void main(String[] args) {

        Staff abramovA = new Staff("Абрамов", "Авраам"); //Объявляем новые объекты
        Staff borisovB = new Staff("Борисов", "Брут");
        Staff vasilevV = new Staff("Васильев", "Вильгельм");
        Staff gavrilovG = new Staff("Гаврилов", "Гавр");
        Staff denisovD = new Staff("Денисов", "Джон");

//        Staff[] staff = new Staff[] {abramovA, borisovB,vasilevV, gavrilovG, denisovD};
        List<Staff> staffList = Arrays.asList(abramovA, borisovB, vasilevV, gavrilovG, denisovD); //Создаем динамиский мфссив

        int salary;
        int age;
        for (int i = 0; i < staffList.size(); i++) { //В цикле заполняем числовые поля объектов
            salary = random.nextInt(500000);
            age = random.nextInt(65);
            staffList.get(i).setId(i);
            staffList.get(i).setSalary(salary);
            staffList.get(i).setAge(age);
        }

        abramovA.setEmail("abramovA@gmail.com"); //Заполняем поля объектов
        abramovA.setPhone("+79211234567");
        abramovA.setPosition("Генеральный директор");

        borisovB.setEmail("borisovB@gmail.com");
        borisovB.setPhone("+79218901234");
        borisovB.setPosition("Полицейский");

        vasilevV.setEmail("vasilevV@gmail.com");
        vasilevV.setPhone("+79215678901");
        vasilevV.setPosition("Пожариный");

        gavrilovG.setEmail("gavrilovG@gmail.com");
        gavrilovG.setPhone("+79212345678");
        gavrilovG.setPosition("Капитан корабля");

        denisovD.setEmail("denisovD@gmail.com");
        denisovD.setPhone("+79219012345");
        denisovD.setPosition("Президент");

        System.out.println("Список сотрудников старше 40 лет");
        for (Staff staff : staffList) { //Получаем список старших сотрудников
            if (staff.getAge() > 40) System.out.println(staff.toString());
        }
    }
}
