import animals.*;
import food.*;

public class Worker {
    private String name;
    private String status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Worker(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public void feed(Food food, Animals animals) {
        System.out.println("Покормить: " + animals.getName() + " - " + food.getName());
        animals.eat(food);
    }

    public void getVoice(Voice animals) {
        System.out.println("Вы заставляете подать голос: " + animals.getName());
        animals.voice();
    }
}

