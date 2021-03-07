package animals;

import food.Food;

public class Wolf extends Carnivorus implements Howling {
    private String group;

    public Wolf(String name, String view, int age, String group) {
        super(name, view, age);
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
}

interface Howling {
    public void howl();
}
