package animals;

import food.Food;

public class Wolf extends Carnivorus implements Howling {
    private String group;

    public Wolf(String name, String view, int satiety, int age, String group) {
        super(name, view, satiety, age);
        this.group = group;

    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void howl() {
        System.out.println("Вууууууууууууууууу(Волк воет.Не на луну.)");
    }


    @Override
    public boolean eat(Food food) {
        return food.isMeat();
    }

    @Override
    public void feed(Food food, Animals animals) {
        if (animals.eat(food) == true) {
            System.out.println("Вууууу, свежее мясо ...");
        } else {
            System.out.println("Тьфу, ты бы мне ещё консервных банок притащил...");
        }

    }

}

interface Howling {
    public void howl();
}
