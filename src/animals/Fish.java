package animals;

import food.Food;

public class Fish extends Carnivorus implements Swimmable {

    private int size;

    public Fish(String name, String view, int satiety, int age, int size) {
        super(name, view, satiety, age);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void swim() {
        System.out.println("Рыбка плавает");
    }

    @Override
    public boolean eat(Food food) {
        return food.isMeat();
    }

    @Override
    public void feed(Food food, Animals animals) {
if(animals.eat(food)==true){
    System.out.println("Рыба быстро подплыла и схватила еду...");
}
else {
    System.out.println("Рыба не может ничего вам сказать , но если бы могла .....");
}
    }

}

interface Swimmable {
    public void swim();
}
