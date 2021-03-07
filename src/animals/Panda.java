package animals;

import food.Food;

public class Panda extends Herbivorous implements Eating{

    public Panda(String name,String view,int satiety,int age){
        super(name,view,satiety,age);
    }

    public void eatBamboo(){
        System.out.println("Ёуу восап бро , у тебя нет немного бамбука для меня??");
    }

    @Override
    public boolean eat(Food food) {
        return !food.isMeat();
    }

    @Override
    public void feed(Food food, Animals animals) {
        if(animals.eat(food)==true){
            System.out.println("ёу бро , отчлиный бамбук ты приташил ...");
        }
        else {
            System.out.println("ооу неет.., кажется это плохо пахнет.. У тебя нет немного бамбука .. ?");
        }

    }

}

interface Eating {
    public void eatBamboo();
}