package animals;

import food.Food;

public class Duck extends Herbivorous implements Quacking {
    private String color;

    public Duck(String name, String view, int satiety, int age, String color) {
        super(name, view, satiety, age);
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

    @Override
    public void feed(Food food, Animals animals) {
if(animals.eat(food)==true){
    System.out.println("Утка, благодарно крякает...");
}
else {
    System.out.println("Утка , посмотрела на еду... и на вас....?");
}
    }

}

interface Quacking {
    public void quack();
}