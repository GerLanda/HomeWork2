package animals;

import food.Beef;
import food.Chicken;
import food.Food;

public class Wolf extends Carnivorus implements Voice, Run {
    private String group;

    public Wolf(String name, String view, int age, String group) {
        super(name, view, age);
        this.group = group;

    }

    public String getGroup() {
        return group;
    }

    public void run() {
        System.out.println("Волк бегает на 4 лапах.");
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void voice() {
        System.out.println("Вууууууууууууууууу(Волк воет.Не на луну.)");
    }

    public void sit() {
        System.out.println("Волк сидит...");
    }

    public void jump() {
        System.out.println("Волк высоко прыгает кста...(до 5м)");
    }

    @Override
    public void eat(Food food) {
        if (food.isMeat() == true && food instanceof Beef || food instanceof Chicken) {
            System.out.println("Вууууу, свежее мясо ...");
        } else {
            System.out.println("Ты бы мне ещё консервных банок притащил...");
        }
    }
}

