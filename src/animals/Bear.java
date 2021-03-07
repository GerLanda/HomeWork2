package animals;

import food.Food;

public class Bear extends Carnivorus implements Roaring {
    private int weight;

    public Bear(String name, String view, int satiety, int age, int weight) {
        super(name, view, satiety, age);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void roar() {
        System.out.println("Ррррррёёёёёввввв.(Кажется к нему лучше не подходить!!!)");
    }

    @Override
    public boolean eat(Food food) {
        return food.isMeat();

    }

    @Override
    public void feed(Food food, Animals animals) {
if(animals.eat(food)==true){
    System.out.println("Рррр, миша доволен...");
}
else {
    System.out.println("Я такое не ем ,рррр , миша начинает злиться ....");
}
    }

}

interface Roaring {
    public void roar();
}



