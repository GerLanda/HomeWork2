package animals;


import food.Food;

public abstract class Herbivorous extends Animals {

    public Herbivorous(String name, String view, int satiety, int age) {
        super(name, view, satiety, age);
    }

    @Override
    public boolean eat(Food food) {
        return !food.isMeat();
    }

    @Override
    public String name() {
        return  "Травоядное";
    }
}















