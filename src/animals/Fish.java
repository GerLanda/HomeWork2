package animals;

import food.Food;
import food.FreshFish;

public class Fish extends Carnivorus implements Swimming {

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

    public void whirl() {
        System.out.println(getName()+" кружит на поверхности...");
    }

    public void dive() {
        System.out.println(getName() + " слился с дном...");
    }

    @Override
    public void eat(Food food) {
        if (food.isMeat() == true && food instanceof FreshFish) {
            System.out.println("Рыба быстро подплыла и схватила еду...");
        } else {
            System.out.println("Рыба игнорирует, эту еду...");
        }
    }
}


