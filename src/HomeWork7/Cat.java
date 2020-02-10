package HomeWork7;

import java.util.Random;

public class Cat {
    static Random random = new Random();
    final String name;
    private int appetite;
    private int satiety;
    public static final int MIN_FOOD = 10;
    public static final int MAX_FOOD = 300;

    public Cat(String name) {
        this.name = name;
        getAppetite();
    }

    public void getAppetite() {
        appetite = MIN_FOOD + random.nextInt(MAX_FOOD - MIN_FOOD);
    }

    //Кот взаимодействует с тарелкой и ее содержимым. В результате взаимодеймтвия меняется количество содержимого.
    public void eat(Plate plate){
        int getFood = plate.getFood();
        if (getFood < appetite - satiety){
            littleFood(plate, getFood);
        }
        else {
            enoughFood(plate, getFood);
        }
    }

    private void enoughFood(Plate plate, int getFood) {
        plate.setFood(getFood - appetite + satiety);
        satiety = appetite;
        catInfo();
        plate.plateInfo();
    }

    private void littleFood(Plate plate, int getFood) {
        satiety += getFood;
        System.out.printf("Кот %s, апетит %d грамм, съел %d грамм, сытость %d, требуется еды %d грамм.%n",
                name, appetite, getFood, satiety, appetite - satiety);
        plate.setFood(0);
        plate.addFood();
        System.out.println();
        eat(plate);
    }

    public void catInfo(){
        System.out.print(this);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                "} ";
    }
}
