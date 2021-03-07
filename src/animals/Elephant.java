package animals;

import food.Food;

public class Elephant extends Herbivorous implements Onlooking {

    private int weight;

    public Elephant(String name, String view, int satiety, int age, int weight) {

        super(name, view, satiety, age);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void watch() {
        System.out.println("Слон просто смотрит на вас и машет хоботом.");
    }


    @Override
    public boolean eat(Food food) {
        return !food.isMeat();
    }


    @Override
    public void feed(Food food, Animals animals) {
if(animals.eat(food)==true){
    System.out.println("Слон, любезно машет ушами ....");
}
else{
    System.out.println("Слон, недоумевает...");
}
    }

}

interface Onlooking {
    public void watch();
}