package animals;

import food.Food;
import food.Fruit;

public class Elephant extends Herbivorous implements Run {

    private int weight;

    public Elephant(String name, String view, int age, int weight) {

        super(name, view, age);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void run(){
        System.out.println("Слон ходит на 4 конечностях и машет ушами.");
    }

    public void sit(){
        System.out.println("Телосложение и мускулатура слонов позволяют им принимать сидячее положение, однако в природе они делают это редко. ...");
    }

    public void jump(){
        System.out.println("Взрослые слоны не умеют прыгать(... Главная причина — огромный вес: кости и связки суставов не выдержали бы перегрузок при отталкивании и приземлении");
    }


    @Override
    public void eat(Food food) {
        if (food.isMeat() == false&& food instanceof Fruit) {
            System.out.println("Слон, любезно машет ушами ....");
        } else {
            System.out.println("Слон, недоумевает и топчет ногами, эта еда ему не нравится...");
        }
    }
}

