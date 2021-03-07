package animals;

public abstract class Herbivorous extends Animals {

    public Herbivorous(String name, String view, int satiety, int age) {
        super(name, view, satiety, age);
    }
}

class Duck extends Herbivorous {
    private String color;

    public Duck(String name, String view, int satiety, int age, String color) {
        super(name, view, satiety, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

 class Elephant extends Herbivorous {

    private String weight;

    public Elephant(String name, String view, int satiety, int age, String weight) {

        super(name, view, satiety, age);
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}

class Panda extends Herbivorous{

    public Panda(String name,String view,int satiety,int age){
        super(name,view,satiety,age);
    }


}






