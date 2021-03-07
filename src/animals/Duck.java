package animals;

import food.Food;

public class Duck extends Herbivorous implements Quacking, Pond.Swimming {
    private String color;

    public Duck(String name, String view, int age, String color) {
        super(name, view, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void quack() {
        System.out.println("Уточка, крякает.");
    }

    @Override
    public boolean eat(Food food) {
        return !food.isMeat();
    }

    public void swim() {
        System.out.println(getName() + " плавает в пруду ...");
    }
}

interface Quacking {
    public void quack();
}