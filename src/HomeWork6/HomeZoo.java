package HomeWork6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HomeZoo {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static void main(String[] args) {

        PetAnimal cat1 = new Cat(1, "Artur");
        PetAnimal cat2 = new Cat(2, "Boris");
        PetAnimal cat3 = new Cat(3, "Check");
        PetAnimal dog1 = new Dog(4, "Abrams");
        PetAnimal dog2 = new Dog(5, "Bard");
        PetAnimal dog3 = new Dog(6, "Chook");

        List<PetAnimal> zoo = new ArrayList<>();
        zoo.add(cat1);
        zoo.add(cat2);
        zoo.add(cat3);
        zoo.add(dog1);
        zoo.add(dog2);
        zoo.add(dog3);

        for (PetAnimal petAnimal : zoo) {
            System.out.println(petAnimal.toString());
        }

        int lenRun, maxRun;
        int lenSwim, maxSwim;
        for (PetAnimal petAnimal : zoo) {
            if (petAnimal instanceof Cat){
                maxRun = ((Cat)petAnimal).MAX_RUN;
                maxSwim = ((Cat)petAnimal).MAX_SWIM;
            } else {
                maxRun = ((Dog)petAnimal).MAX_RUN;
                maxSwim = ((Dog)petAnimal).MAX_SWIM;
            }
            petAnimal.setLenRun(random.nextInt(maxRun));
            petAnimal.setLenRun(random.nextInt(maxSwim));
        }
    }
}
