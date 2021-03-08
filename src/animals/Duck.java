package animals;

import food.Food;

public class Duck extends Herbivorous implements Swimming,Voice {
    private String color;

    public Duck(String name, String view, int age, String color) {
        super(name, view, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void voice() {
        System.out.println("Вы заставляете утку крякать...Вы крякаете, кря-кря... кря-кря... Утка не реагирует... Возможно она думает, что вы сумасшедший");
    }

    @Override
    public void eat(Food food) {
        if (food.isMeat() == false) {
            System.out.println("Утка, благодарно крякает...");
        } else {
            System.out.println("Утка, посмотрела на еду... и на вас..., снова на еду... , снова на вас...?");
        }
    }

    public void swim() {
        System.out.println(getName() + " плавает в пруду ...");
    }
}

