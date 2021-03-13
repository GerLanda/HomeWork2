package animals;

import food.Bamboo;
import food.Food;
import food.Fruit;

public class Panda extends Herbivorous implements Voice, Run {

    public Panda(String name, String view, int age) {
        super(name, view, age);
    }

    public void voice() {
        System.out.println("Ёуу восап бро, у тебя нет немного бамбука для меня??");
    }

    public void run() {
        System.out.println("Панда ходит, опираясь на передние лапы.");
    }

    public void sit(){
        System.out.println("Панда сидит на дереве...");
    }

    public void jump(){
        System.out.println("Панда запрыгнула на дерево...");
    }

    @Override
    public void eat(Food food) {
        if (food.isMeat() == false&&food instanceof Bamboo || food instanceof Fruit) {
            System.out.println("ёу бро , забористый бамбук ты приташил ...");
        } else {
            System.out.println("ооу неет.., кажется это плохо пахнет.. У тебя нет немного бамбука для меня ...?");
        }
    }
}

