package animals;

import food.Food;

public class Panda extends Herbivorous implements Eating {

    public Panda(String name, String view, int age) {
        super(name, view, age);
    }

    public void eatBamboo() {
        System.out.println("Ёуу восап бро, у тебя нет немного бамбука для меня??");
    }

    @Override
    public boolean eat(Food food) {
        return !food.isMeat();
    }
}

interface Eating {
    public void eatBamboo();
}