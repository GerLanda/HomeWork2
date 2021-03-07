package animals;

import food.Food;

public class Bear extends Carnivorus implements Roaring {
    private int weight;

    public Bear(String name, String view, int age, int weight) {
        super(name, view, age);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void roar() {
        System.out.println("Ррррррёёёёёввввв.(К мише лучше не подходить!!!)");
    }

    @Override
    public boolean eat(Food food) {
        return food.isMeat();
    }
}

interface Roaring {
    public void roar();
}



