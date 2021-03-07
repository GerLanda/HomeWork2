package animals;

public class Duck extends Herbivorous {
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