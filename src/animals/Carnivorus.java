package animals;

import food.Food;

public class Carnivorus extends Animals {

    public Carnivorus(String name, String view, int satiety, int age) {
        super(name, view, satiety, age);
    }


    @Override
    public boolean eat(Food food) {
        return food.isMeat();
    }

    @Override
    public String name() {
        return  "Хищник";
    }
}







