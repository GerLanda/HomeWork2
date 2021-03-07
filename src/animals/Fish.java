package animals;

import food.Food;

public class Fish extends Carnivorus implements Pond.Swimming {

    private int size;

    public Fish(String name, String view, int age, int size) {
        super(name, view, age);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void swim() {
        System.out.println(getName() + " плавает в пруду...");
    }

    @Override
    public boolean eat(Food food) {
        return food.isMeat();
    }
}


