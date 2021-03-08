package animals;

import food.Food;

public class Bear extends Carnivorus implements Voice,Run{
    private int weight;

    public Bear(String name, String view, int age, int weight) {
        super(name, view, age);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void voice(){
        System.out.println("\"Ррррррёёёёёввввв.(К мише лучше не подходить!!!)\"");
    }

    public void run(){
        System.out.println("Медведь ходит опираясь на передние лапы.");
    }

    @Override
    public void eat(Food food) {
        if (food.isMeat() == true) {
            System.out.println("Медведь кушает..., миша доволен...");
        } else {
            System.out.println("Медведь рычит, кажется эта еда ему не нравится, миша начинает злиться ...");
        }
    }
}



