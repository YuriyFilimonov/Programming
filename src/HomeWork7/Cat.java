package HomeWork7;

public class Cat {
    String name;
    int appetite;
    double satiety;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate){
        int getFood = plate.getFood();
        if (getFood < appetite){
            satiety = Math.round(getFood * 10000/appetite)/100;
            System.out.printf("Кот %s с апетитом %d грамм съел весь корм в количестве %d грамм и его сытость" +
                    " составила %d %%", name, appetite, getFood, satiety);
            plate.setFood(0);
            plate.addFood();
        }
        else {
            plate.setFood(getFood - appetite);
        }
    }
}
