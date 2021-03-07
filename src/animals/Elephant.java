package animals;

import food.Food;

public class Elephant extends Herbivorous implements Onlooking {

    private int weight;

    public Elephant(String name, String view, int age, int weight) {

        super(name, view, age);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void watch() {
        System.out.println("Слон просто смотрит на вас и машет хоботом...");
    }

    @Override
    public boolean eat(Food food) {
        return !food.isMeat();
    }
}

interface Onlooking {
    public void watch();
}