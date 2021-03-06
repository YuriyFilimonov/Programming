package HomeWork6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeZoo {
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

//        List<PetAnimal> petAnimals = new Arrays.asList(cat1, cat2, cat3, dog1, dog2, dog3);
        int countCat, coutnDog;
        countCat = coutnDog = 0;
        for (PetAnimal petAnimal : zoo) {
            petAnimal.setLenRun(random.nextInt(petAnimal.setMaxRun()+1));
            petAnimal.setLenSwim(random.nextInt(petAnimal.setMaxSwim()+1));
            if (petAnimal instanceof Cat) {
                countCat++;
            } else {
                coutnDog++;
            }
        }
        System.out.println("В домашнем зоопарке всего: " + zoo.size() + " животных, в том числе " + countCat
                + " кошек и " + coutnDog + " собак.");

        for (PetAnimal petAnimal : zoo) {
            petAnimal.printAction();
        }
    }
}
